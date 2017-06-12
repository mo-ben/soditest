import fr.sodifrance.invoice.Product;
import fr.sodifrance.invoice.ProductTypeEnum;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by mbe on 12/06/17.
 */
public class TestProduct {


    @Test
    public void testLocalBookProductFields(){
        Product book=new Product("Le dernier théorème de Fermat","12.49", ProductTypeEnum.BOOK);
        Assert.assertEquals(book.getHtPrice(),new BigDecimal("12.49"));
        Assert.assertEquals(book.getType(),ProductTypeEnum.BOOK);
        Assert.assertEquals(book.getTaxAmount(),new BigDecimal("0.00"));
    }

    @Test
    public void testLocalFoodProduct(){
        Product book=new Product("barre de chocolat","0.85", ProductTypeEnum.FOOD);
        Assert.assertEquals(book.getHtPrice(),new BigDecimal("0.85"));
        Assert.assertEquals(book.getType(),ProductTypeEnum.FOOD);
        Assert.assertEquals(book.getTaxAmount(),new BigDecimal("0.00"));
    }

    @Test
    public void testLocalOtherProduct(){
        Product book=new Product("flacon de parfum","18.99", ProductTypeEnum.OTHER);
        Assert.assertEquals(book.getHtPrice(),new BigDecimal("18.99"));
        Assert.assertEquals(book.getType(),ProductTypeEnum.OTHER);
        Assert.assertEquals(book.getTaxAmount(),new BigDecimal("1.90"));
    }


    @Test
    public void testImportedBookProductFields(){
        Product book=new Product("Le dernier théorème de Fermat importé","9.75", ProductTypeEnum.BOOK,true);
        Assert.assertEquals(book.getHtPrice(),new BigDecimal("9.75"));
        Assert.assertEquals(book.getType(),ProductTypeEnum.BOOK);
        Assert.assertEquals(book.getTaxAmount(),new BigDecimal("0.50"));
    }

    @Test
    public void testImportedFoodProduct(){
        Product book=new Product("boîte de chocolats importés","11.25", ProductTypeEnum.FOOD,true);
        Assert.assertEquals(book.getHtPrice(),new BigDecimal("11.25"));
        Assert.assertEquals(book.getType(),ProductTypeEnum.FOOD);
        Assert.assertEquals(book.getTaxAmount(),new BigDecimal("0.60"));
    }

    @Test
    public void testImportedOtherProduct(){
        Product book=new Product("flacon de parfum importé","27.99", ProductTypeEnum.OTHER,true);
        Assert.assertEquals(book.getHtPrice(),new BigDecimal("27.99"));
        Assert.assertEquals(book.getType(),ProductTypeEnum.OTHER);
        Assert.assertEquals(book.getTaxAmount(),new BigDecimal("4.20"));
    }


}
