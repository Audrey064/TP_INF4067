
package org.example.patternsConstruction.patternFactory.AvecFabriqueAbstraite;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory1 = new ConcreteFactory1();
        ProductFactory productFactory2 = new ConcreteFactory2();

        ProductA productA = null;

        System.out.println("Utilisation de la premiere fabrique");
        productA = productFactory1.getProduct();
        productA.methodA();

        System.out.println("Utilisation de la seconde fabrique");
        productA = productFactory2.getProduct();
        productA.methodA();

    }
}