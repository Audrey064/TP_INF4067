package org.example.patternsConstruction.patternFactory.AvecFabriqueAbstraite;

public class ConcreteFactory2 extends ProductFactory {

    @Override
    protected ProductA createProductA() {
        return new ProductA2();
    }
}
