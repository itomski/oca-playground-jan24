package de.lubowiecki.vererbung2;

public class FinalTest {

    public static void main(String[] args) {

        // String ist final d.h. es kann keine Kindklassen mit geänderter Funktionalität geben!
        String s = "Hallo";

        Person p1 = new Student();
        p1.setVorname("Peter");
        p1.setNachname("Parker");
        System.out.println(p1);


        //Student s1 = new Student();
        Student s1 = new SpezialStudent();
        s1.setVorname("Bruce");
        s1.setNachname("Banner");
        s1.setStudienfach("Informatik");
        System.out.println(s1);

    }
}

class Person {

    private String vorname;
    private String nachname;

    public String getVorname() {
        return vorname;
    }

    public final void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public final void setNachname(String nachname) {
        this.nachname = nachname;
    }
}

class Student extends Person {

    private String studienfach;

    public String getStudienfach() {
        return studienfach;
    }

    public final void setStudienfach(String studienfach) {
        this.studienfach = studienfach;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("vorname='").append(getVorname()).append('\'');
        sb.append(", nachname='").append(getNachname()).append('\'');
        sb.append(", studienfach='").append(studienfach).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

abstract class AbstractSpecialStudent extends Student {

    // Wird in der Erbfolge eine konkrete Methode mit einer abstrakten überschrieben
    // muss diese in der Kindklasse erneut implementiert werden

    @Override
    public abstract String getStudienfach();

    // Erzwingt die erneute Implementierung der toString-Methode
    @Override
    public abstract String toString();
}


class SpezialStudent extends AbstractSpecialStudent {

    // Bei einer finalen Klasse kann es keine Kindklassen geben
    // Bei finalen Methoden darf diese in der Kindklasse nicht überschrieben werden d.h. Funktionalität
    // der Methode darf nicht geändert werden

    /*
    // Kein Überschrieben möglich, da diese Methoden final sind
    @Override
    public void setNachname(String nachname) {
    }

    @Override
    public void setVorname(String vorname) {
    }

    @Override
    public void setStudienfach(String studienfach) {
    }
    */

    @Override
    public String getStudienfach() {
        return "Spezial";
    }

    @Override
    public String toString() {
        return "SpecialStudent: " + getVorname() + ", " + getNachname() + ", " + getStudienfach();
    }
}