package org.example.patternComportement.strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("Black and white filter applied to the file");
    }
}
