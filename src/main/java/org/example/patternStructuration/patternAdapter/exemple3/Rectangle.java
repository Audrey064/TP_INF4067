package org.example.patternStructuration.patternAdapter.exemple3;

public class Rectangle {

    private float longueur;
    private float largeur;

    public float perimetre(){
        return (longueur + largeur) * 2;
    }

    public float aire(){
        return longueur * largeur;
    }
}
