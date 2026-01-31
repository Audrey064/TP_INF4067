package org.example.patternComportement.templateMethod;

public class CommandeCameroun extends Commande{

    @Override
    protected void calculTva() {
        montantTva = (montantHT * 0.196f);
    }

    @Override
    public void affiche() {
        System.out.println("Le montant Toute taxe comprise est " + montantTva);
    }
}
