
package org.example.patternsConstruction.patternSingleton.exemple2;

public class Main {
    public static void main(String[] args) {

        int sum = Singleton.getInstance().sum(2, 5);

        System.out.printf("la somme est %d", sum);

        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(5, 9);
        s2.affiche();
    }
}