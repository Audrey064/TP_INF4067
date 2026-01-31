
package org.example.patternsConstruction.patternSingleton.exemple1;

public class Main {
    public static void main(String[] args) {

        Singleton.getInstance().op1(1, 2, 3);
        Singleton.getInstance().op2(3, 4, 5);

        Singleton singleton = Singleton.getInstance();
        singleton.op1(1, 2, 3);
        singleton.op2(3, 4, 5);
    }

}