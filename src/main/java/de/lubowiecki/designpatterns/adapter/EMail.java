package de.lubowiecki.designpatterns.adapter;

import java.time.LocalDateTime;

public class EMail implements Message {

    private final String from;

    private final String to;

    private final String body;

    private final LocalDateTime sendAt;

    public EMail(String from, String to, String body) {
        this.from = from;
        this.to = to;
        this.body = body;
        this.sendAt = LocalDateTime.now();
    }

    @Override
    public void compute() {
        System.out.println("--- SEND E-MAIL ---");
        System.out.println("--- AT: " + sendAt);
        System.out.println("--- FROM: " + from);
        System.out.println("--- TO: " + to);
        System.out.println("--- BODY: " + body);
        System.out.println();
    }
}
