package de.lubowiecki.designpatterns.composite;

public abstract class AbstractGeoForm implements GeoForm {

    private int x;

    private int y;

    public AbstractGeoForm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
