package org.example.patternStructuration.patternDecorator;

public class DecorateurCurseurHorizontal extends DecorateurFenetre{
    public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    public void dessinerCurseurHorizontal(){
        System.out.println("C'est un curseur horizontal");
    }
}
