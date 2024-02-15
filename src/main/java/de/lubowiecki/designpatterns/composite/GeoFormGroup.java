package de.lubowiecki.designpatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeoFormGroup implements GeoForm {

    private List<GeoForm> elements;

    public GeoFormGroup(GeoForm... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public void add(GeoForm element) {
        elements.add(element);
    }

    @Override
    public void print() {
        for (GeoForm geo : elements) {
            geo.print(); // Die Gruppe delegiert das print an die enthaltenen Objekte
        }
    }

    @Override
    public void moveTo(int x, int y) {
        for (GeoForm geo : elements) {
            geo.moveTo(x, y); // Die Gruppe delegiert das moveTo an die enthaltenen Objekte
        }
    }
}
