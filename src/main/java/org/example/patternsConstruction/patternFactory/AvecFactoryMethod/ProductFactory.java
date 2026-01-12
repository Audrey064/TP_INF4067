package org.example.patternsConstruction.patternFactory.AvecFactoryMethod;

public class ProductFactory {

    public static final int TYPE_PRODUCTA1 = 1;
    public static final int TYPE_PRODUCTA2 = 2;

    public ProductA getProduct(int typeProduct){
        ProductA productA = null;
        switch (typeProduct){
            case TYPE_PRODUCTA1 :
                productA = new ProductA1();
                break;

            case TYPE_PRODUCTA2:
                productA = new ProductA2();
                break;

            default:
                throw new IllegalArgumentException("Type de produit inconny");
        }
        return productA;
    }

}
