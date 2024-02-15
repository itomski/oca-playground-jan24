package de.lubowiecki.designpatterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        Server server = new Server();

        server.receive(new EMail("p.parker@shield.org", "t.stark@shield.org", "Hi, ich bin der Spiderman"));
        server.receive(new EMail("p.parker@shield.org", "t.stark@shield.org", "Hi, ich bin immer noch der Spiderman"));
        server.receive(new EMail("p.parker@shield.org", "b.banner@shield.org", "Hi, ich bin der Spiderman"));
        server.receive(new EMail("p.parker@shield.org", "n.romanov@shield.org", "Hi, ich bin der Spiderman"));
        server.receive(new EMail("n.romanov@shield.org", "p.parker@shield.org", "Hör damit auf!!!!"));

        Tweet tweet1 = new Tweet("pparker", "Das ist ja toll. Ich bin ein Avanger!", "spiderman", "avanger", "hero", "power");
        tweet1.addTag("news", "newyork", "ny");

        // tweet1.print();
        // server.receive(tweet1); // Tweet ist nicht mit dem Server kompatibel
        server.receive(new TweetToMessageAdapter(tweet1)); // Der Adapter wird um das Tweet gelegt

        server.stop();

    }

}
