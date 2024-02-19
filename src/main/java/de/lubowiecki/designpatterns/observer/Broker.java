package de.lubowiecki.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

// Beobachter
public class Broker implements Observer {

    private final String name;

    private final Strategy strategy;

    private Action action;

    public Broker(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
        this.action = Action.BUY;
    }


    @Override
    public void update(Observable o, Object arg) {

        Aktie aktie = (Aktie) o;

        switch(strategy) {

            case RISKY:
                System.out.println(name + ": Kauft " + aktie.getName());
                action = Action.BUY;
                break;

            case NORMAL:
                System.out.println(name + ": Hält " + aktie.getName());
                action = Action.HOLD;
                break;

            case CAREFUL:
                System.out.println(name + ": Verkauft " + aktie.getName());
                action = Action.SELL;
                break;
        }
    }
}
