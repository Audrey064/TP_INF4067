package org.example.patternComportement.strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("File compressed into .jpeg file");

    }
}
