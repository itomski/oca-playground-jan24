package de.lubowiecki.playground;

public class ThisSuperTest {

    public static void main(String[] args) {

        JuraStudent s1 = new JuraStudent("Peter");

    }
}

class Mensch {

    public Mensch() {
        // super();
        System.out.println("Mensch C1");
    }

}

class Student extends Mensch {

    public Student() {
        // super();
        System.out.println("Student C1");
    }

}

class JuraStudent extends Student {

    public JuraStudent() {
        // super();
        System.out.println("JuraStudent C1");
    }

    public JuraStudent(String name) {
        this(); // Muss die erste Zeile im Konstruktor sein
        System.out.println("JuraStudent C2");
    }
}
