package org.example.patternStructuration.patternAdapter.exemple3;

public class AdaptRectangle implements ICarre{

    private Rectangle rectangle;
    @Override
    public float perimetre() {
        return rectangle.perimetre();
    }

    @Override
    public float aire() {
        return rectangle.aire();
    }
}
