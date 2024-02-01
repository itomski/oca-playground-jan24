package de.lubowiecki.collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

// Comparable beschreibt die natürliche Ordnung für dieses Objekt
// Comparable kann aber nur 1x pro Klasse implementiert werden
public class Customer implements Comparable<Customer> {

    private UUID id;

    private String firstname;

    private String lastname;

    public UUID getId() {
        return id;
    }

    public Customer() {
        this.id = UUID.randomUUID();
    }

    public Customer(UUID id, String fisrtname, String lastname) {
        this.id = id;
        this.firstname = fisrtname;
        this.lastname = lastname;
    }

    public Customer(String fisrtname, String lastname) {
        this();
        this.firstname = fisrtname;
        this.lastname = lastname;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String fisrtname) {
        this.firstname = fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id='").append(id).append('\'');
        sb.append(", firstname='").append(firstname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        //System.out.println("equals: " + firstname);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(firstname, customer.firstname) && Objects.equals(lastname, customer.lastname);
    }

    @Override
    public int hashCode() {
        //System.out.println("hashCode: " + firstname);
        return Objects.hash(id, firstname, lastname);
    }

    @Override
    public int compareTo(Customer other) {
        return firstname.compareTo(other.firstname);
    }
}
