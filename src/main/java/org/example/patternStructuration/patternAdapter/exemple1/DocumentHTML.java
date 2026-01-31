package org.example.patternStructuration.patternAdapter.exemple1;

public class DocumentHTML extends Document {
    @Override
    public void setContenu(String contenu) {
        System.out.println("contenu d'un document HTML");
    }

    @Override
    public void dessine() {
        System.out.println("Dessin pour un document HTML");
    }

    @Override
    public void imprime() {
        System.out.println("Imprimer un document HTML");
    }
}
