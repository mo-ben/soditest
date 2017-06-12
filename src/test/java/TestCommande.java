import fr.sodifrance.invoice.Order;
import fr.sodifrance.invoice.Product;
import fr.sodifrance.invoice.ProductTypeEnum;
import org.junit.Test;

/**
 * Created by mbe on 12/06/17.
 */
public class TestCommande {

    //this is not a regular test just for print0.85
    //todo delete this
    @Test
    public void testCommand(){
        Product p1=new Product("livre","12.49", ProductTypeEnum.BOOK);
        Product p2=new Product("CD musical","16.49", ProductTypeEnum.OTHER);
        Product p3=new Product("barre de chocolat","0.85", ProductTypeEnum.FOOD);

        Order commande=new Order();
        commande.withProduct(p1,1).withProduct(p2,1).withProduct(p3,1);
        commande.printInvoice();
    }


    //this is not a regular test just for print0.85
    //todo delete this
    @Test
    public void testCommand2(){
        Product p1=new Product("boîte de chocolats importée","10.50", ProductTypeEnum.FOOD,true);
        Product p2=new Product("flacon de parfum importé","54.65", ProductTypeEnum.OTHER,true);

        Order commande=new Order();
        commande.withProduct(p1,1).withProduct(p2,1);
        commande.printInvoice();
    }
}
