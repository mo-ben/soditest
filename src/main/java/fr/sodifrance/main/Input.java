package fr.sodifrance.main;

import fr.sodifrance.invoice.IProduct;
import fr.sodifrance.invoice.Product;
import fr.sodifrance.invoice.ProductTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple class that store a simple product store for simulation purpose
 */
public class Input {

    /**
     * @return first input product list
     */

    public static List<IProduct> getInput1() {
        List<IProduct> toReturn = new ArrayList<>();
        toReturn.add(new Product("livre", "12.49", ProductTypeEnum.BOOK));
        toReturn.add(new Product("CD musical", "14.99", ProductTypeEnum.OTHER));
        toReturn.add(new Product("barre de chocolat", "0.85", ProductTypeEnum.FOOD));
        return toReturn;
    }

    /**
     * @return second input product list
     */
    public static List<IProduct> getInput2() {
        List<IProduct> toReturn = new ArrayList<>();
        toReturn.add(new Product("boîte de chocolats importée", "10.00", ProductTypeEnum.FOOD, true));
        toReturn.add(new Product("flacon de parfum importé", "47.50", ProductTypeEnum.OTHER, true));
        return toReturn;
    }

    /**
     * @return third input product list
     */
    public static List<IProduct> getInput3() {
        List<IProduct> toReturn = new ArrayList<>();
        toReturn.add(new Product("flacon de parfum importé", "27.99", ProductTypeEnum.OTHER, true));
        toReturn.add(new Product("flacon de parfum", "18.99", ProductTypeEnum.OTHER, false));
        toReturn.add(new Product("boîte de pilules contre la migraine", "9.75", ProductTypeEnum.DRUG, false));
        toReturn.add(new Product("boîte de chocolats importés", "11.25", ProductTypeEnum.FOOD, true));
        return toReturn;
    }
}
