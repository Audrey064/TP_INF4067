package org.example.patternStructuration.patternDecorator;

public class FenetreSimple implements Fenetre{
    @Override
    public void dessiner() {
        System.out.println("Dessin d'une fenetre simple");
    }

    @Override
    public void decrire() {
        System.out.println("Il s'agit d'une fenetre de couleur #couleur, avec des gardes fou et de 2 petites baies vitrées coulissantes");
    }
}
