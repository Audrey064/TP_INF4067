package org.example.patternComportement.strategy;

public class HighContrastFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("High contrast filter applied to the file");
    }
}
