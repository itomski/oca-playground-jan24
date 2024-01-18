package de.lubowiecki.playground;

import org.apache.commons.lang3.builder.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VergleichsTest {

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker", LocalDate.of(1995, 12, 1), 172));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(1985, 1, 15), 168));
        personen.add(new Person("Bruce", "Banner", LocalDate.of(1978, 8, 17), 186));
        personen.add(new Person("Steve", "Rogers", LocalDate.of(1921, 5, 1), 182));

        // Collections.sort(personen); // Verwendet die natürliche Ordnung -> Comparable
        //Collections.sort(personen, new PersonVornameComparator()); // Sortiert nach Comparator
        personen.sort(new PersonNachnameComparator()); // Sortiert nach Comparator

        //Comparator<Person> nachGroesse = (a, b) -> a.getGroesse() - b.getGroesse();
        //personen.sort(nachGroesse); // Sortiert nach Comparator

        personen.sort((a, b) -> a.getGroesse() - b.getGroesse()); // Sortiert nach Comparator

        for (Person p : personen) {
            //System.out.println(p.getVorname() + " " + p.getNachname() + ", " + p.getGeburtsDatum() + ", " + p.getGroesse());
            System.out.println(p);
        }

        // TODO: Vergleichen mit Guava und Apache-Commans zeigen
    }
}

class PersonVornameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getVorname().compareTo(b.getVorname());
    }
}

class PersonNachnameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getNachname().compareTo(b.getNachname());
    }
}

// Immutable
// Das Comparable-Interface beschreibt die natürliche Ordnung eines Objekts
class Person implements Comparable<Person> {

    private final String vorname;
    private final String nachname;
    private final LocalDate geburtsDatum;
    private final int groesse;

    public Person(String vorname, String nachname, LocalDate geburtsDatum, int groesse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.groesse = groesse;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public int getGroesse() {
        return groesse;
    }

    @Override
    public int compareTo(Person other) {
        return geburtsDatum.compareTo(other.geburtsDatum);
    }

    /*
    @Override
    public int compareTo(Person other) {
        return CompareToBuilder.reflectionCompare(this, other);
    }
    */

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }


}

