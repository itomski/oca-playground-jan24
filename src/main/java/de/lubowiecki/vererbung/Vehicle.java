package de.lubowiecki.vererbung;

import java.awt.*;

public abstract class Vehicle implements Movable { // Erbt von Object

    // da Vehicle abstract ist, muss es die Methoden von Movable nicht implementieren

    private String registration;
    private int speed;
    private Point position = new Point(); // x: 0 und y: 0

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
