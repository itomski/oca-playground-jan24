package de.lubowiecki.designpatterns.singleton;

public class SigletonTest {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        s1.append("Hallo");
        s1.append(" ");

        Singleton s2 = Singleton.getInstance();
        s2.append("Welt");

        Singleton.getInstance().append("...");

        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(Singleton.getInstance().get());
    }
}
