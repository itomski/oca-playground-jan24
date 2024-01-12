package de.lubowiecki.vererbung;

import java.awt.*;

public class Truck extends Vehicle {

    private String load;

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    // Überschreiben = in dieser Klasse die geerbte Methode überlagern
    @Override // Verändert setSpeed für Truck-Objekte
    public void setSpeed(int speed) {
        if(speed > 100) {
            System.out.println("Das ist zu schnell");
        }
        else {
            // setSpeed(speed); // Ruft rekursiv sich selbst auf, weil die Methode hier deklariert ist
            super.setSpeed(speed); // Ruft die Methode in der Elternklasse (Vehicle) auf
        }
    }

    @Override
    public void moveForward() {
        getPosition().x++;
    }
}
