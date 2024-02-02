package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest1 {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        // Wegen dem Verschieben kann es zu unerwarteten Nebeneffekten kommen
        for (int i = 0; i < zahlen.size() ; i++) {
            System.out.println(zahlen.remove(i));
        }

        System.out.println();

        zahlen = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        Iterator<Integer> itr = zahlen.iterator();

        // Gibt alle Elemente aus
        while(itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }

        System.out.println();

        zahlen = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        // Gleichzeitiges Lesen und Schreiben in die Liste führt zu ConcurrentModificationException
        for(Integer i : zahlen) {
            System.out.println(zahlen.remove(i));
        }

        System.out.println();

    }
}
