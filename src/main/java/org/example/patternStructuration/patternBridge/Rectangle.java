package org.example.patternStructuration.patternBridge;

public class Rectangle extends Shape{

    Rectangle(Color color){
        super(color);
    }
    @Override
    public void colorIt() {
        System.out.println("Rectangle filled with");
        color.fillColor();
    }
}
