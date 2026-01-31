package org.example.patternComportement.templateMethod;

public class CommandeGabon extends Commande{

    private float montantPrestation;

    private float montantMaterielHt;

    public void setMontantPrestation(float montantPrestation){
        this.montantPrestation = montantPrestation;
    }

    public void setMontantMaterielHt(float montantMaterielHt) {
        this.montantMaterielHt = montantMaterielHt;
    }

    @Override
    protected void calculTva() {
        montantTva = montantPrestation * 0.12f + montantMaterielHt*0.15f;
    }

    @Override
    public void affiche() {
        System.out.println("Le montant Toute taxe comprise est " + montantTva);
    }
}
