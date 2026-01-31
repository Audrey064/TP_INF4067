package org.example.patternStructuration.patternDecorator;

public abstract class DecorateurFenetre implements Fenetre{

   protected Fenetre fenetre;

    public DecorateurFenetre(Fenetre fenetre){
        this.fenetre = fenetre;
    }
    @Override
    public void dessiner() {

    }

    @Override
    public void decrire() {

    }
}
