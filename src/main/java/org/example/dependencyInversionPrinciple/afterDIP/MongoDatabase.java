package org.example.dependencyInversionPrinciple.afterDIP;

public class MongoDatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}
