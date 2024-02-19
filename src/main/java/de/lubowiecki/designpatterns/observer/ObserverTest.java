package de.lubowiecki.designpatterns.observer;

import java.util.Random;

public class ObserverTest {

    public static void main(String[] args) {

        Aktie a1 = new Aktie("Super Micro Computers", 850.00);
        Aktie a2 = new Aktie("Microsoft", 350.00);

        Broker b1 = new Broker("Peter", Strategy.CAREFUL);
        Broker b2 = new Broker("Bruce", Strategy.NORMAL);
        Broker b3 = new Broker("Carol", Strategy.RISKY);
        Broker b4 = new Broker("Steve", Strategy.RISKY);


        a1.addObserver(b1);
        a1.addObserver(b3);
        a1.addObserver(b4);

        a2.addObserver(b1);
        a2.addObserver(b2);
        a2.addObserver(b4);

        Random random = new Random();

        while(true) {

            a1.changePreis(random.nextDouble(0.05));
            a2.changePreis(random.nextDouble(0.05));

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
