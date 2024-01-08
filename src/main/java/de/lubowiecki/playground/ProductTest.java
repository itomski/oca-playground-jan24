package de.lubowiecki.playground;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product("Tasse, gelb", "Eine tolle gelbe Tasse. 100% Keramik", 100, 5.99);
        Product p2 = new Product("Tasse, blau", "Eine tolle blaue Tasse. 100% Keramik", 10, 7.99);
        Product p3 = new Product("Tasse, rot", "Eine tolle rote Tasse. 100% Keramik", 50, 2.99);

        Product[] liste = {p1, p2, p3};

        for (Product p : liste) {
            System.out.println(p);
        }


    }


}
