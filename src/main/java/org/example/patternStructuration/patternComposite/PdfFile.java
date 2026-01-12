package org.example.patternStructuration.patternComposite;

public class PdfFile extends FileSystem {

    public PdfFile(String name){
        super(name, "pdf");
    }
    @Override
    public void describe() {

        System.out.println("File Name: " + name + " Type: " + type);
    }
}
