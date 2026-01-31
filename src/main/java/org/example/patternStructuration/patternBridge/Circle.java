package org.example.patternStructuration.patternBridge;

public class Circle extends Shape{

    Circle (Color color){
        super(color);
    }
    @Override
    public void colorIt() {
        System.out.println("Circle filled with ");
        color.fillColor();
    }
}
