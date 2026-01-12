package org.example.patternsConstruction.patternFactory.AvecFabriqueAbstraite;

public class ConcreteFactory1 extends ProductFactory {
    @Override
    protected ProductA createProductA() {
        return new ProductA1();
    }
}
