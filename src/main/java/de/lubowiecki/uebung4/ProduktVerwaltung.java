package de.lubowiecki.uebung4;

import de.lubowiecki.playground.Product;

import java.util.ArrayList;
import java.util.List;

public class ProduktVerwaltung {

    private List<Produkt> produkte;

    public ProduktVerwaltung() {
        // TODO: Checken, ob Altdaten vorliegen
        this.produkte = new ArrayList<>();
    }

    public void add(Produkt produkt) {
        produkte.add(produkt);
    }

    public List<Produkt> findAll() {
        // TODO: Die Modifizierung der Liste verhindern
        return produkte;
    }

    public boolean remove(Product product) {
        return produkte.remove(product);
    }

    public Produkt findOne() {
        throw new UnsupportedOperationException("Ist noch nicht implementiert.");
    }
}
