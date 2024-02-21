package de.lubowiecki.io;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToStreamTest {

    public static void main(String[] args) {

        /*
        int[] arr = new int[1_000_000];

        // Zufallswerte erzeugen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 6) + 1;
        }

        // Werte anzeigen
        for (int i : arr) {
            System.out.println(i);
        }
        */

        Stream<Integer> stream = Stream.generate(() -> (int)(Math.random() * 6) + 1);

        List<Integer> werte = stream.limit(100)
                .map(i -> i * i)
                .collect(Collectors.toList()); // Werte einsammeln zu einer List
                //.forEach(v -> System.out.println(v));

        System.out.println(werte);

        System.out.println();

        Stream.of(10.0, 15.2, 18.7, 22.0, 1.1)
                .filter(d -> d > 10)
                .sorted()
                .forEach(System.out::println); // Methodenreferenz

        System.out.println();

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker", LocalDate.of(2000, 10, 1)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(1987, 5, 15)));
        personen.add(new Person("Steve", "Rogers", LocalDate.of(1922, 1, 7)));
        personen.add(new Person("Bruce", "Banner", LocalDate.of(1987, 2, 18)));
        personen.add(new Person("Natasha", "Romanov", LocalDate.of(2002, 8, 2)));
        personen.add(new Person("Tony", "Stark", LocalDate.of(2000, 6, 12)));

        // Läuft immer sequenziell ab
        for (Person p: personen) {
            if(p.getBirthdate().isBefore(LocalDate.now().minusYears(30)))
                System.out.println(p.getFirstname() + " " + p.getLastname());
        }

        System.out.println();

        // Kann parallel ablaufen
        personen.stream()
                .parallel()
                .filter(p -> p.getBirthdate().isBefore(LocalDate.now().minusYears(30)))
                .forEach(p -> System.out.println(p.getFirstname() + " " + p.getLastname()));


        System.out.println();

        Map<Integer, List<Person>> groups = personen.stream().collect(Collectors.groupingBy(p -> p.getBirthdate().getYear()));
        System.out.println(groups);

        System.out.println();

        String namen = personen.stream()
                .map(p -> p.getFirstname())
                .reduce("", (s1, s2) -> s1 + ", " +s2);

        System.out.println(namen);
    }
}

class Person {

    private String firstname;
    private String lastname;
    private LocalDate birthdate;

    public Person(String firstname, String lastname, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstname='").append(firstname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", birthdate=").append(birthdate);
        sb.append('}');
        return sb.toString();
    }
}