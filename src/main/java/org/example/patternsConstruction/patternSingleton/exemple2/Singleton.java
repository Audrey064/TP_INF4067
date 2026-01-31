package org.example.patternsConstruction.patternSingleton.exemple2;

public class Singleton {

    private static Singleton instance = null;

    private int x;
    private int y;

    private Singleton(){
        super();
    }

    private Singleton(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y){
        if(instance == null){
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public int sum (int x, int y){
        return x + y;
    }

    public float moyenne (int x, int y){
        return sum(x, y)/2;
    }

    public void affiche(){
        System.out.println("\nJe suis une instance mes valeurs sont: x = " + this + " et y = " + this.y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
