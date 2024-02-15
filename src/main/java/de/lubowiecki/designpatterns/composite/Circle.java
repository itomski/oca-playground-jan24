package de.lubowiecki.designpatterns.composite;

public class Circle extends AbstractGeoForm {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Circle: x " + getX() + ", y " + getY() + ", r " + radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
