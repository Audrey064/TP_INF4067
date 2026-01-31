package org.example.patternComportement.strategy;

public class ImageStorage {

    private Compressor compressor;

    private Filter filter;

    public ImageStorage (Compressor compressor, Filter filter){
        this.compressor = compressor;
        this.filter = filter;
    }

    void store (){
        System.out.println("file successuful stored");
    }

}
