package org.example.patternsConstruction.patternBuilder;

public class Main {
    public static void main(String[] args) {

         MonteurPizzaPiquante monteurPizzaPiquante = new MonteurPizzaPiquante();

    /*     monteurPizzaPiquante.créerNouvellePizza();
         monteurPizzaPiquante.monterSauce();
         monteurPizzaPiquante.monterPate();
         monteurPizzaPiquante.monterGarniture();*/

         Directeur directeur = new Directeur(monteurPizzaPiquante);

        System.out.println(directeur.construire());

        Pizza pizza = directeur.construire();

        pizza.print();


    }
}