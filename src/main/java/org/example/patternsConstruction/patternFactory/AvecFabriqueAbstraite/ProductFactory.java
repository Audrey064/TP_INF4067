package org.example.patternsConstruction.patternFactory.AvecFabriqueAbstraite;

public abstract class ProductFactory {

    public ProductA getProduct(){
        return createProductA();
    }

    protected abstract ProductA createProductA();
}
