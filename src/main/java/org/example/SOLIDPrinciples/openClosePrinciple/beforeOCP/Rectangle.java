package org.example.SOLIDPrinciples.openClosePrinciple.beforeOCP;

public class Rectangle {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
