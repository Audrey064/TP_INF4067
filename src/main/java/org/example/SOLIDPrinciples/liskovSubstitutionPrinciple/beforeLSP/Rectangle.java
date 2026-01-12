package org.example.SOLIDPrinciples.liskovSubstitutionPrinciple.beforeLSP;
public class Rectangle {
    protected int width;
    protected int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return width * height;
    }
}
