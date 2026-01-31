package org.example.patternStructuration.patternDecorator;

public class DecorateurCurseurVertical extends DecorateurFenetre{
    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        System.out.println("Dessin d'une fenetre");
    }

    @Override
    public void decrire() {
        System.out.println("Il s'agit d'une fenetre de couleur #couleur, avec des gardes fou et de 2 petites baies vitrées coulissantes");
    }

    public void dessinerCurseurVertical(){
        System.out.println("C'est un curseur vertical");
    }
}
