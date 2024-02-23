package de.lubowiecki.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class EqualsTest {

    public static void main(String[] args) {

        Book b1 = new Book("123");
        Book b2 = new Book("123");
        System.out.println(b1.equals(b2));

        Byte b = 100;
        Long l = 100l;
        //Float f = (float) b + (int) l; // unboxing + widening

        // bei true wird 100 auf i zugewiesen
        // bei false wird 200 auf i zugewiesen
        int i = (b < 50) ? (b > 100 ? 500 : 100) : 200;

        var j = 100;
        // j = 10.0;

        var list = new ArrayList<>();
        // list = new LinkedList<>(); // Error: list_Referenz ist eine ArrayList


    }

}

class Book {

    private String isbn;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }
}
