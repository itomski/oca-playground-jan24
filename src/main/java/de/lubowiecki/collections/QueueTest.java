package de.lubowiecki.collections;

import java.util.*;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> zahlen = new LinkedList<>();

        //zahlen.add(100);
        zahlen.offer(100);
        zahlen.offer(200);
        zahlen.offer(900);
        zahlen.offer(150);

        System.out.println(zahlen.peek()); // Zeigt das Element am Anfang der Schlange ohne es zu entfernen
        System.out.println(zahlen.peek());
        System.out.println(zahlen.peek());

        System.out.println(zahlen.poll()); // Entfernt das Element am Anfang der Schlange und liefert es zurück
        //System.out.println(zahlen.poll());
        //System.out.println(zahlen.poll());

        System.out.println();

        for (int i: zahlen) { // Elemente werden nicht entfernt
            System.out.println(i);
        }
        System.out.println(zahlen);

        System.out.println();

        zahlen.offer(15);
        zahlen.offer(22);
        zahlen.offer(1024);

        while(!zahlen.isEmpty()) {
            System.out.println(zahlen.poll()); // Elemente werden nacheinander verarbeitet
        }

        System.out.println(zahlen);

        System.out.println();

        // Als Stack (LIFO)
        Deque<String> namen = new LinkedList<>();
        namen.push("Peter");
        namen.push("Bruce");
        namen.push("Natasha");
        namen.push("Carol");
        namen.push("Tony");

        while(!namen.isEmpty()) {
            System.out.println(namen.pop());
        }

        System.out.println();

        Queue<String> namenStack = Collections.asLifoQueue(namen);
        namenStack.offer("Peter");
        namenStack.offer("Bruce");
        namenStack.offer("Natasha");
        namenStack.offer("Carol");
        namenStack.offer("Scott");

        while(!namenStack.isEmpty()) {
            System.out.println(namenStack.poll());
        }

        System.out.println();

        namenStack.offer("Peter");
        namenStack.offer("Bruce");
        namenStack.offer("Natasha");
        namenStack.offer("Carol");
        namenStack.offer("Scott");

        // für ein Return
        Collection<String> collection = Collections.unmodifiableCollection(namenStack);
        // collection.remove("Carol"); // UnsupportedOperationException

    }
}


