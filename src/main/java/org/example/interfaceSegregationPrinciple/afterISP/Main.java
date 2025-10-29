package org.example.interfaceSegregationPrinciple.afterISP;

public class Main {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.eat();
        human.work();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}