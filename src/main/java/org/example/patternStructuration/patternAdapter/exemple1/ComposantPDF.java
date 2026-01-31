package org.example.patternStructuration.patternAdapter.exemple1;

public class ComposantPDF {

    public void pdfFixeContenu(String contenu){
        System.out.println("Ceci est le contenu de notre document pdf");
    }

    public void pdfPrepareAffichage(){
        System.out.println("Préparation de l'affichage en cours");
    }

    public void pdfRafraichir(){
        System.out.println("Le pdf a été rafraichit");
    }

    public void pdfTermineAffichage(){
        System.out.println("Affichage terminée");
    }

    public void pdfEnvoieImprimante(){
        System.out.println("Le pdf est en cours d'impression");
    }
}
