package org.example.SOLIDPrinciples.singleResponsabilityPrinciple.beforeSRP;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID", "Étudiants de M1-GL", "Révisions des principes SOLID");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Audrey Betine");
    }
}