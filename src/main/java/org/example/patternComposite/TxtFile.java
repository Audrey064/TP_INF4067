package org.example.patternComposite;

public class TxtFile extends FileSystem{

    public TxtFile(String name){
        super(name, "txt");
    }
    @Override
    public void describe() {
        System.out.println("File Name: " + name + " Type: " + type);
    }
}
