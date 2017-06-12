package fr.sodifrance.invoice;

import java.math.BigDecimal;

/**
 * Iproduct Interface
 */
public interface IProduct {

     /**
      * @return The product shor description
      */
     String  getDescription();

     /**
      * @return product price without taxe
      */
     BigDecimal getHtPrice();

     /**
      * @return the price included the tax
      */
     BigDecimal getTtcPrice();

     /**
      * @return true if the product is imported
      */
     Boolean isImported();

     /**
      * @return the tax amount
      */
     BigDecimal getTaxAmount();

     /**
      * @return product type (category)
      */
     ProductTypeEnum getType();


}
