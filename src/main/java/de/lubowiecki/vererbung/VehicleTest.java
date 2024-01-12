package de.lubowiecki.vererbung;

import java.lang.reflect.Method;

public class VehicleTest {

    public static void main(String[] args) {

        Truck truck = new Truck();
        truck.setLoad("Äpfel");
        System.out.println(truck.getLoad());


        for(Method m : truck.getClass().getMethods()) { // Liefert ein Objekt, dass die Klasse beschreibt
            System.out.println(m.getName());
        }

        System.out.println();

        // System.out.println(truck.speed); // Error: ist privat
        System.out.println(truck.getSpeed());

        // Referenztyp entscheidet darüber, welche Methoden sichtbar/nutzbar sind
        // Instanzmethoden werden aber trotzdem auf dem Objekttyp ausgeführt
        // Referenztyp: Vehicle, kann eine konkrete Klasse, abstrakte Klasse oder Interface sein
        // Objekttyp: Truck, muss immer eine konkrete Klasse sein
        Vehicle vehicle = new Truck();
        // vehicle.setLoad("Äpfel"); // Error: im Vehicle nicht verfügbar
        // System.out.println(vehicle.getLoad()); // Error: im Vehicle nicht verfügbar

        Object object = new Truck();
        // System.out.println(object.getSpeed()); // Error: im Object nicht verfügbar

        System.out.println();

        Vehicle vehicle1 = new Truck();
        vehicle1.setSpeed(200); // Verwendet hier die überschriebene Methode aus der Klasse Truck
        System.out.println(vehicle1.getSpeed());
        vehicle1.moveForward();
        System.out.println(vehicle1.getPosition());

        System.out.println();

        vehicle1 = new Car();
        vehicle1.setSpeed(200); // Car hat keine eigene setSpeed-Methode. Es wird die aus Vehicle verwendet
        System.out.println(vehicle1.getSpeed());
        vehicle1.moveForward();
        //System.out.println(vehicle1.getPosition());

        Movable m = new Truck();
        m.moveForward();

        m = new Car();
        m.moveForward();

        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        // Statische Methoden und Eigenschaften werden auf dem Referenztyp ausgeführt


    }
}
