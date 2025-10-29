package org.example.interfaceSegregationPrinciple.afterISP;

public class RobotWorker implements Workable{
    @Override
    public void work() {
        System.out.println("Les robots travaillent sans fatigue");
    }
}
