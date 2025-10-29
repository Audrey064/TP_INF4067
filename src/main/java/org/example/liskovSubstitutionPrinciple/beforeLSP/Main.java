package org.example.liskovSubstitutionPrinciple.beforeLSP;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(5);
        System.out.println("Aire du rectangle = " + rectangle.getArea());

        Rectangle rectangle1 = new Square();
        rectangle1.setHeight(4);
        rectangle1.setWidth(5);
        System.out.println("Aire du carré = " + rectangle1.getArea());
    }
}