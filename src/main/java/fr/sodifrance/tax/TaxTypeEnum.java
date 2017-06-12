package fr.sodifrance.tax;

import java.math.BigDecimal;

/**
 * Tax type
 */
public enum  TaxTypeEnum {

    NORMAL_TAX("Taux normal de tva",new BigDecimal("10")),

    INCREASED_TAX("Taux majoré pour les produit importée",new BigDecimal("5"));

    private String description;

    private BigDecimal rate;

    TaxTypeEnum(String description, BigDecimal rate) {
        this.description = description;
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getRate() {
        return rate;
    }
}
