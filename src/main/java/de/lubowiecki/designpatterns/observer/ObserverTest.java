package de.lubowiecki.designpatterns.observer;

public class ObserverTest {

    public static void main(String[] args) {

        Aktie a1 = new Aktie("Super Micro Computers", 850.00);

        a1.changePreis(0.05);
        a1.changePreis(0.075);
        a1.changePreis(-0.025);


    }
}
