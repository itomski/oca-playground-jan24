package de.lubowiecki.designpatterns.composite;

public class Rect extends AbstractGeoForm {

    private int height;
    private int width;

    public Rect(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public void print() {
        System.out.println("Rect: x " + getX() + ", y " + getY() + ", h " + height + ", w " + width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
