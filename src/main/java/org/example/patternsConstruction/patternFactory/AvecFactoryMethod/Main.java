
package org.example.patternsConstruction.patternFactory.AvecFactoryMethod;

public class Main {
    public static void main(String[] args) {

        ProductFactory productFactory = new ProductFactory();

        ProductA productA = null;

        productA = productFactory.getProduct(ProductFactory.TYPE_PRODUCTA1);
        productA.methodA();

        productA = productFactory.getProduct(ProductFactory.TYPE_PRODUCTA2);
        productA.methodA();

        productA = productFactory.getProduct(3);
        productA.methodA();
    }
}