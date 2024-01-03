package de.lubowiecki.playground;

public class ProtokollTest {

    private static String data = "";
    private String content = "";

    public static void main(String[] args) {

        ProtokollTest.data += "Dies und das \n";
        data += "Dies und das \n";
        data += "Dies und das \n";
        data += "Dies und das \n";
        System.out.println(data);

        ProtokollTest pt = new ProtokollTest();
        pt.content += "Das und Nix \n";
        pt.content += "Das und Nix \n";
        pt.content += "Das und Nix \n";
        pt.content += "Das und Nix \n";
        System.out.println(pt.content);

    }
}
