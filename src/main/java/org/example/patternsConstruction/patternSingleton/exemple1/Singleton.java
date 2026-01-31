package org.example.patternsConstruction.patternSingleton.exemple1;

public class Singleton {

    private static Singleton instance = null;

    private String attrib1;

    private int attrib2;

    private Singleton (){
        super();
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void op1(int x, int y, int z){

        this.attrib1 = "bonjour";
        System.out.println(attrib1);

    }

    public void op2(int x, int y, int z){



    }
}
