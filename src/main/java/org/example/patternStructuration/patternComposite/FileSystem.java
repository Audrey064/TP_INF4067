package org.example.patternStructuration.patternComposite;

public abstract class FileSystem {


    protected String name;
    protected String type;

    public FileSystem(String name, String type){
        this.name = name;
        this.type = type;
    }
    public abstract void describe();

    public void add(FileSystem element){
        throw new UnsupportedOperationException();
    }
    public void delete(FileSystem element){
        throw new UnsupportedOperationException();
    }
    public FileSystem getElement(int i){
        throw new UnsupportedOperationException();
    }
}
