package de.lubowiecki.collections;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class MapTest1 {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();

        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Berlin", 3_500_000);
        einwohner.put("München", 1_600_000);
        einwohner.put("Köln", 900_000);
        einwohner.put("Berlin", 900_000); // Update für den Key Berlin

        System.out.println(einwohner);

        System.out.println(einwohner.get("München"));

        System.out.println();

        for (String stadt : einwohner.keySet()) {
            System.out.println(stadt + ": " + einwohner.get(stadt));
        }

        System.out.println();

        for (Integer zahl : einwohner.values()) {
            System.out.println(zahl);
        }

        System.out.println();

        for (Map.Entry<String, Integer> eintrag : einwohner.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }

        System.out.println();

        //Map<LocalDate, Map<LocalTime, List<Termin>>> termine;

        Arrays.sort(new int[]{1,2,3,4,8,7,1,0});

    }
}
