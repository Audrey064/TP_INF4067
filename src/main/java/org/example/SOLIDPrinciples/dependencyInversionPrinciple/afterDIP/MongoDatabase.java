package org.example.SOLIDPrinciples.dependencyInversionPrinciple.afterDIP;

public class MongoDatabase implements Database{
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}
