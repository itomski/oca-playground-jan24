package de.lubowiecki.vererbung;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    private List<String> passengers = new ArrayList<>();

    public void addPassenger(String name) {
        passengers.add(name);
    }

    public List<String> getPassengers() {
        return passengers;
    }

    @Override
    public void moveForward() {
        throw new UnsupportedOperationException("Noch nicht implementiert");
    }
}
