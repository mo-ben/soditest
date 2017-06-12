package fr.sodifrance.invoice;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Order class.
 */
public class Order {

    /**
     * Order products
     */
    private List<OrderItem> productList=new ArrayList<>();

    /**
     * Add product to command
     *
     * @param product
     * @param quantity
     *
     * @return {{@link Order}}
     */
    public Order withProduct(IProduct product, int quantity) {
        if(product!=null){
            productList.add(new OrderItem(quantity,product));
        }
        return  this;
    }

    /**
     * Print the invoice to the screen
     */
    public void printInvoice(){
        BigDecimal totalTtcPrice=new BigDecimal(0);
        BigDecimal totaTaxAmount=new BigDecimal(0);
        for(OrderItem orderItem :productList){
            IProduct p= orderItem.getProduct();
            System.out.println(String.format("%s %s : %s", orderItem.getQuantity(),p.getDescription(),p.getTtcPrice()));
            totalTtcPrice=totalTtcPrice.add(p.getTtcPrice().multiply(new BigDecimal(orderItem.getQuantity())));
            totaTaxAmount=totaTaxAmount.add(p.getTaxAmount().multiply(new BigDecimal(orderItem.getQuantity())));
        }
        System.out.println(String.format("Montant des taxes : %s",totaTaxAmount));
        System.out.println(String.format("Total : %s",totalTtcPrice));
    }
}
