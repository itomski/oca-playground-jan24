package de.lubowiecki.playground;

public class DestructorTest {

    // Instanzkonstante
    private final String NAME = "DT"; // Muss spätestens im Konstruktor einen Wert bekommen

    // Klassenkonstante
    private static final String OTHER_NAME = "DT"; // Muss "sofort" einen Wert bekommen

    public static void main(String[] args) {

        DestructorTest dt = new DestructorTest();
        dt = null;
        System.gc();

        final int x = 10; // Lokale Konstante
        // x = 11; // x ist eine Konstante
    }

    public DestructorTest() {
        System.out.println("C1");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("UGHRRRRR!!!!!!!!");
    }
}
