package fr.sodifrance.main;

import fr.sodifrance.invoice.Order;
import fr.sodifrance.invoice.IProduct;

import java.util.List;

/**
 * Project main class
 */
public class EntryPoint {



    public static void main(String[] args) {
        processInput("OutPut 1",Input.getInput1());
        processInput("OutPut 2",Input.getInput2());
        processInput("OutPut 3",Input.getInput3());

    }

    private static void processInput(String title,List<IProduct> productList){
        System.out.println(String.format("#### %s:\n",title));
        Order order=new Order();
        productList.forEach(product ->
                order.withProduct(product,1)
        );
        order.printInvoice();
        System.out.println("\n");
    }

}
