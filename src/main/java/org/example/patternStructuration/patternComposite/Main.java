package org.example.patternStructuration.patternComposite;

public class Main {
    public static void main(String[] args) {
        FileSystem txtFile = new TxtFile("notes.txt");
        FileSystem pdfFile = new PdfFile("report.pdf");

        Directory directory = new Directory("Root j -");

        Directory subDirectory = new Directory("Projects");

        subDirectory.add(new TxtFile("MyToDoList.txt"));

        directory.add(txtFile);
        directory.add(pdfFile);
        directory.add(subDirectory);

        directory.describe();
    }
}