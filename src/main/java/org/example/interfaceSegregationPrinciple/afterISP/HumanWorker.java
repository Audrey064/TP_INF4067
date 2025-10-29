package org.example.interfaceSegregationPrinciple.afterISP;

public class HumanWorker implements Eatable{
    @Override
    public void eat() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void work() {
        System.out.println("Les humains mangent");
    }
}
