package org.example.patternComportement.strategy;

public class PngCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("File compressed into .png file");
    }
}
