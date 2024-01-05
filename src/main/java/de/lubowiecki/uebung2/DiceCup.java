package de.lubowiecki.uebung2;

import java.util.Arrays;
import java.util.Random;

public class DiceCup {

    private int faces = 6;

    private final Random rand = new Random();

    public DiceCup() {
    }

    public DiceCup(int faces) {
        this.faces = faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    public int roll() {
        return rand.nextInt(faces) + 1;
    }

    public int[] roll(int count) {

        int[] sammlung = new int[count]; // Baut ein leeres Array in passender Größe
        for (int i = 0; i < sammlung.length ; i++) {
            sammlung[i] = roll();
        }
        return sammlung;
    }

    public void stats(int[] rolls) {

        Arrays.sort(rolls);
        int biggest = rolls[rolls.length - 1];
        int[] stats = new int[biggest];

        for (int res : rolls) {
            stats[res - 1]++;
        }

        for (int i = 0; i < stats.length ; i++) {
            if(stats[i] != 0)
                System.out.println((i + 1) + " x " + stats[i]);
        }
    }
}
