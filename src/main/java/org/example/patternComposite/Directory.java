package org.example.patternComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem{
    private List<FileSystem> elements = new ArrayList<>();

    public Directory(String name){
        super(name, "directory");
    }
    @Override
    public void describe() {
        System.out.println("Directory: " + name + " Type: " + type);
        for (FileSystem e: elements){
            e.describe();
        }
    }

    @Override
    public void add(FileSystem element) {
        elements.add(element);
    }

    @Override
    public void delete(FileSystem element) {
        elements.remove(element);
    }

    @Override
    public FileSystem getElement(int i) {
        return elements.get(i);
    }
}
