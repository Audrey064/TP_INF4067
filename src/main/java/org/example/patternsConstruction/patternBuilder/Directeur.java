package org.example.patternsConstruction.patternBuilder;

import java.util.List;

public class Directeur {

    public MonteurPizza monteurPizza;

    public Directeur(MonteurPizza pizza) {
        this.monteurPizza = pizza;
    }

    public Pizza construire(){
        monteurPizza.créerNouvellePizza();
        monteurPizza.monterGarniture();
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
         return monteurPizza.getPizza();
    }

}
