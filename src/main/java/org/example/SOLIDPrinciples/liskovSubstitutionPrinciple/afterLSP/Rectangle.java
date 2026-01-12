package org.example.SOLIDPrinciples.liskovSubstitutionPrinciple.afterLSP;

public class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.width=width;
        this.height=height;
    }

    @Override
    public int getArea(){
        return width*height;
    }
}
