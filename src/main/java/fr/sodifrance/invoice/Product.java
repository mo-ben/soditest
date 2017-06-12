package fr.sodifrance.invoice;

import java.math.BigDecimal;

/**
 * Product class
 */
public class Product extends AbstractProduct {

    /**
     * Create a product Object
     *
     * @param decription Product short description
     * @param htPrice  Product ht price
     * @param productTypeEnum Product type
     */
    public Product(final String decription,final String htPrice,final ProductTypeEnum productTypeEnum) {
        this(decription,new BigDecimal(htPrice),productTypeEnum,false);
    }

    /**
     * Create a product Object
     * @param decription Product short description
     * @param htPrice Product ht price
     * @param productTypeEnum Product type
     * @param isImported mark product as imported or not
     */
    public Product(final String decription,final String htPrice,final ProductTypeEnum productTypeEnum,final Boolean isImported) {
        this(decription,new BigDecimal(htPrice),productTypeEnum,isImported);
    }


    public Product(final String decription,final BigDecimal htPrice,final ProductTypeEnum productTypeEnum,final Boolean isImported){
        this.description=decription;
        this.htPrice=htPrice;
        this.productTypeEnum=productTypeEnum;
        this.imported=isImported;
        this.taxAmount=calculateTaxAmount();

    }

}

