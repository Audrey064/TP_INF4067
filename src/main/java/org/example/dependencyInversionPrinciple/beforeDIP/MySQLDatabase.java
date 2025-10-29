package org.example.dependencyInversionPrinciple.beforeDIP;

public class MySQLDatabase {
    public void save (String data){
        System.out.println("Saving to MySQL: " + data);
    }
}
