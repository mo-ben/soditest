package fr.sodifrance.invoice;

import fr.sodifrance.tax.TaxTypeEnum;

import java.math.BigDecimal;

/**
 * Abstract Product class
 *
 * All common function for product  must be written in this class.
 */
public abstract class AbstractProduct implements IProduct {

    /**
     * Product short description or label
     */
    protected String description;

    /**
     *
     */
    protected BigDecimal htPrice;

    /**
     * Tax Amount for the product
     */
    protected BigDecimal taxAmount;

    /**
     * Indicate if product is imported or not
     */
    protected Boolean imported=false;

    /**
     * Product type
     */
    protected ProductTypeEnum productTypeEnum;



    /**
     * Calculate the tax amount
     * @return
     */
    protected BigDecimal calculateTaxAmount(){
        BigDecimal taxRate;
        BigDecimal baseTaxRate;

        baseTaxRate=productTypeEnum.isTaxable()? TaxTypeEnum.NORMAL_TAX.getRate():new BigDecimal("0");
        taxRate=isImported()? baseTaxRate.add(TaxTypeEnum.INCREASED_TAX.getRate()):baseTaxRate;

        return round( htPrice.multiply(taxRate).divide(new BigDecimal("100")));

    }

    /**
     * {@inheritDoc}
     */
    public String getDescription() {
        return  description;
    }


    /**
     * {@inheritDoc}
     */
    public BigDecimal getHtPrice() {
        return htPrice;
    }

    @Override
    public BigDecimal getTtcPrice() {
        return getHtPrice().add(getTaxAmount());
    }

    /**
     * {@inheritDoc}
     */
    public Boolean isImported() {
        return imported;
    }

    /**
     * {@inheritDoc}
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * {@inheritDoc}
     */
    public ProductTypeEnum getType() {
        return productTypeEnum;
    }


    /**
     * Round input to nearest 5 cents
     * @param toRound amount to round.
     * @return the rounded value of the input data
     */
    private BigDecimal round(BigDecimal toRound) {
        BigDecimal TWENTY = new BigDecimal("20");
        BigDecimal divided = toRound.multiply(TWENTY)
                .setScale(0, BigDecimal.ROUND_UP);
        return divided.divide(TWENTY)
                .setScale(2, BigDecimal.ROUND_UP);
    }
}
