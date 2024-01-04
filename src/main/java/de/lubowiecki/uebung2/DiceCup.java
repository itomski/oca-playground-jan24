package de.lubowiecki.uebung2;

import java.util.Random;

public class DiceCup {

    private final int FACES = 6;

    private final Random rand = new Random();


    public int roll() {
        return rand.nextInt(FACES) + 1;
    }

    public int[] roll(int count) {

        int[] sammlung = new int[count]; // Baut ein leeres Array in passender Größe
        for (int i = 0; i < sammlung.length ; i++) {
            sammlung[i] = roll();
        }
        return sammlung;
    }
}
