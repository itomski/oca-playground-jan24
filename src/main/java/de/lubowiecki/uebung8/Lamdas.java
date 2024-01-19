package de.lubowiecki.uebung8;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamdas {

    // Entwerfe eine Liste von Spielkarten
    // Schreibe ein Consumer für die Ausgabe der Spielkarten
    // Schreibe ein Predicate um bestimmte Karten (Farbe oder Kartenwert) aus dem Deck zu entfernen
    // Schreibe einen Supplier, der ein Deck mit mit 5 Zufallskarten liefert

    public static void main(String[] args) {

        Queue<Karte> deck = mischen(createDeck());
        Karte cur = deck.poll();
        System.out.println(cur);

        System.out.println();

        //deck.forEach(k -> System.out.println(k));
        deck.forEach(k -> System.out.println(k.getFarbe() + " " + k.getBild()));

        Supplier<List<Karte>> neueHand = () -> {
            List<Karte> list = new ArrayList<>();
            // TODO: Lösung mit Schleife
            list.add(deck.poll()); // Entnimmt die Karte aus dem Deck
            list.add(deck.poll());
            list.add(deck.poll());
            list.add(deck.poll());
            list.add(deck.poll());
            return list;
        };

        System.out.println();

        List<Karte> hand = neueHand.get();
        System.out.println(hand);

        System.out.println();

        System.out.println(deck);

        // Karten entfernen
        Predicate<Karte> nurPik = k -> k.getFarbe() == Farbe.PIK;
        Predicate<Karte> nurKaro = k -> k.getFarbe() == Farbe.KARO;
        Predicate<Karte> nurAs = k -> k.getBild() == Bild.AS;

        System.out.println();

        //deck.removeIf(nurPik); // Entfernt alle Pik-Karten aus dem Deck
        //deck.removeIf(nurAs); // Entfernt alle As-Karten aus dem Deck

        Queue<Karte> andersDeck = removeKarts(deck, Farbe.HERZ, Bild.AS);
        System.out.println(andersDeck);

    }


    private static List<Karte> createDeck() {

        List<Karte> karten = new ArrayList<>();
        for (Farbe f : Farbe.values()) {
            for (Bild b : Bild.values()) {
                karten.add(new Karte(f, b));
            }
        }

        return karten;
    }

    private static Queue<Karte> mischen(List<Karte> karten) {
        Collections.shuffle(karten);
        return new LinkedList<>(karten);
    }

    private static Queue<Karte> removeKarts(Queue<Karte> deck, Farbe farbe, Bild bild) {

        Predicate<Karte> nurFarbe = k -> k.getFarbe() == farbe;
        Predicate<Karte> nurBild = k -> k.getBild() == bild;
        // TODO: prüfen ob farbe oder bild null ist
        deck.removeIf(nurFarbe.and(nurBild));
        return deck;
    }
}

class Karte {

    private final Farbe farbe;
    private final Bild bild;

    public Karte(Farbe farbe, Bild bild) {
        this.farbe = farbe;
        this.bild = bild;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public Bild getBild() {
        return bild;
    }

    @Override
    public String toString() {
        return farbe + "_" + bild;
    }
}


enum Farbe {

    KREUZ, PIK, HERZ, KARO

}

enum Bild {

    AS, KOENIG, DAME, BUBE, ZEHN, NEUN, ACHT, SIEBEN

}
