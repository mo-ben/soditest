package fr.sodifrance.invoice;

/**
 * Product type enum
 */
public enum ProductTypeEnum {

    OTHER(true),

    BOOK(false),

    DRUG(false),

    FOOD(false);

    private Boolean taxable;

    ProductTypeEnum(Boolean taxable) {
        this.taxable = taxable;
    }

    public Boolean isTaxable() {
        return taxable;
    }
}
