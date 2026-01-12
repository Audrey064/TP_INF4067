package org.example.SOLIDPrinciples.dependencyInversionPrinciple.afterDIP;

public class Main {
    public static void main(String[] args) {
        Database database;
        database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("Données à sauvegarder");

        database = new MongoDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("Données à sauvegarder 1");
    }
}
