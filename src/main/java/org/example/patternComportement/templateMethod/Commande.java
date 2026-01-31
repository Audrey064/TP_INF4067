package org.example.patternComportement.templateMethod;

public abstract class Commande {

    protected float montantHT;
    protected float montantTva;
    protected float montantTtc;

    public void calculeMontantTTc (){
        montantTtc = montantHT + montantTva;
    };

    protected abstract void calculTva();

    public abstract void affiche ();

    public float getMontantHT(){
        return montantHT;
    }

    public float getMontantTva() {
        return montantTva;
    }

    public float getMontantTtc() {
        return montantTtc;
    }
}
