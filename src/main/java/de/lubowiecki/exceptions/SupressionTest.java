package de.lubowiecki.exceptions;

public class SupressionTest {

    public static void main(String[] args) {

        try(ZeugWriter writer = new ZeugWriter()) {
            writer.writeZeug();
            // writer.close(); // wird automatisch beim Verlassen des try-Blocks verwendet
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class ZeugWriter implements AutoCloseable {

    void writeZeug() {
        throw new RuntimeException("Problem beim Schreiben");
    }

    @Override
    public void close() throws Exception {
        throw new RuntimeException("Problem beim Schliessen");
    }
}
