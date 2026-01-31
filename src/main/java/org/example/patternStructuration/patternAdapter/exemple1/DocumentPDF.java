package org.example.patternStructuration.patternAdapter.exemple1;

public class DocumentPDF extends Document {

    private ComposantPDF composantPDF;

    @Override
    public void setContenu(String contenu) {
        System.out.println("Ceci est mon contenu PDF");
    }

    @Override
    public void dessine() {
        System.out.println("dessin pour un document pdf");
    }

    @Override
    public void imprime() {
        System.out.println("Imprimer un document HTML");
    }
}
