package de.lubowiecki.designpatterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        Server server = new Server();

        server.receive(new EMail("p.parker@shield.org", "t.stark@shield.org", "Hi, ich bin der Spiderman"));
        server.receive(new EMail("p.parker@shield.org", "t.stark@shield.org", "Hi, ich bin immer noch der Spiderman"));
        server.receive(new EMail("p.parker@shield.org", "b.banner@shield.org", "Hi, ich bin der Spiderman"));
        server.receive(new EMail("p.parker@shield.org", "n.romanov@shield.org", "Hi, ich bin der Spiderman"));
        server.receive(new EMail("n.romanov@shield.org", "p.parker@shield.org", "Hör damit auf!!!!"));

        server.stop();

    }

}
