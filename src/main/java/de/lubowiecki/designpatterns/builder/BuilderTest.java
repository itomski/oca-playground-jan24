package de.lubowiecki.designpatterns.builder;

public class BuilderTest {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Fiat", "500", "HH:AB123");
        System.out.println(v1.getBrand() + ", " + v1.getType() + ", " + v1.getRegistration());
        System.out.println(v1.getRegistration());

        VehicleBuilder vb = new VehicleBuilder();
        vb.setBrand("Ford").setType("Fiesta").setRegistration("HH:CD234");

        Vehicle v2 = vb.build();
        System.out.println(v2.getBrand() + ", " + v2.getType() + ", " + v2.getRegistration());

        Vehicle v3 = vb.setRegistration("HH:CD356").build();
        System.out.println(v3.getBrand() + ", " + v3.getType() + ", " + v3.getRegistration());

        vb = new VehicleBuilder();
        vb.setBrand("Renault");

        v3 = vb.build();
        System.out.println(v3.getBrand() + ", " + v3.getType() + ", " + v3.getRegistration());


        Vehicle v4 = FordFactory.getMustang("HB:XY235");
        System.out.println(v4.getBrand() + ", " + v4.getType() + ", " + v4.getRegistration());

        String s = String.join("-", "A", "B", "C", "D");
        System.out.println(s);

    }
}
