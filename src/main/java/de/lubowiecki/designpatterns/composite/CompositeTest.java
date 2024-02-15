package de.lubowiecki.designpatterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Circle c1 = new Circle(10, 15, 100);
        Circle c2 = new Circle(1, 1, 300);

        Rect r1 = new Rect(5, 5, 20, 50);
        Rect r2 = new Rect(10, 3, 50, 50);

        /*
        c1.moveTo(100, 100);
        c2.moveTo(100, 100);
        r1.moveTo(100, 100);
        r2.moveTo(100, 100);

        c1.print();
        c2.print();
        r1.print();
        r2.print();
        */

        GeoFormGroup g1 = new GeoFormGroup(c1, c2, r1, r2);
        g1.print();

        System.out.println();

        g1.moveTo(100, 100);
        g1.print();

        System.out.println();

        GeoFormGroup g2 = new GeoFormGroup();
        g2.add(new Circle(15, 22, 800));
        g2.add(new Circle(0, -20, 500));
        g2.add(g1); // GeoFormGroup ist selbst GeoForm und kann an eine andere Gruppe übergeben werden

        g2.print();

        System.out.println();

        g2.moveTo(0,0);
        g2.print();
    }
}
