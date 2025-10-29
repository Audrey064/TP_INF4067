package org.example.liskovSubstitutionPrinciple.beforeLSP;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
       super.setWidth(width);
       super.setHeight(height);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setHeight(height);
    }
}
