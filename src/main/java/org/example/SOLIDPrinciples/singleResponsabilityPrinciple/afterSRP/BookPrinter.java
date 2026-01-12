package org.example.SOLIDPrinciples.singleResponsabilityPrinciple.afterSRP;

public class BookPrinter {
    public void printToScreen(BookSRP book){
        System.out.println("===PRINT TO SCREEN====");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }

    public void printToHTML(BookSRP book){
        System.out.println("\n===PRINT TO SCREEN====");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par " + book.getAuthor() + "<h2>");
        System.out.println("<p>" + book.getContent() + "<p>");
    }
}
