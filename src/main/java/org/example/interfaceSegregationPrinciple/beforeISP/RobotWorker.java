package org.example.interfaceSegregationPrinciple.beforeISP;

public class RobotWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        System.out.println("1 on ne doit pas faire manger un robot");
        throw new UnsupportedOperationException("Les robots ne mangent pas");
    }
}
