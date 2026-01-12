package org.example.SOLIDPrinciples.liskovSubstitutionPrinciple.afterLSP;

public class Square implements Shape {
    private int side ;
    public Square(int side){
        this.side = side;
    }
    @Override
    public int getArea(){
        return side * side;
    }
}
