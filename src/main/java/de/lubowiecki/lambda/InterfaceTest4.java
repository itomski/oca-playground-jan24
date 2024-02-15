package de.lubowiecki.lambda;

public class InterfaceTest4 {

    public static void main(String[] args) {

        bereiteLeckeresEssenVor(new CandleLightDinner());
    }

    public static void bereiteLeckeresEssenVor(EssenZubereiten ez) {
        ez.vorbereiten();
        ez.kochen();
        ez.abwaschen();
    }
}

// Interface kann nicht instanziert werden, da die Methoden nicht ausprogrammiert sind
interface EssenZubereiten {

    // automatisch public abstract
    void kochen();

    void vorbereiten();

    void abwaschen();
}

class FruehstucksBrunch implements EssenZubereiten {

    @Override
    public void kochen() {
        System.out.println("Spiegeleier kochen");
    }

    @Override
    public void vorbereiten() {
        System.out.println("Wurst und Käse auf Platten legen");
        System.out.println("Schnittlauch schneiden");
        System.out.println("...");
    }

    @Override
    public void abwaschen() {
        System.out.println("Den ganzen Dreck abwaschen");
        System.out.println("Müll entsorgen");
    }
}

class CandleLightDinner implements EssenZubereiten {

    @Override
    public void kochen() {
        System.out.println("Ente auf der Hautseite anbraten");
        System.out.println("...");
    }

    public void marinieren() {
        System.out.println("Ente wird mit Honig eingeschmiert");
    }

    @Override
    public void vorbereiten() {
        System.out.println("Ente waschen und würzen");
        System.out.println("Kartofeln kochen...");
        System.out.println("Soße ansetzen...");
        System.out.println("...");
    }

    @Override
    public void abwaschen() {
        System.out.println("Töpfe abwaschen");
        System.out.println("Töpfe zurückstellen");
    }
}
