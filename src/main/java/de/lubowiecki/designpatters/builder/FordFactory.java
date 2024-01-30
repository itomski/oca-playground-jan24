package de.lubowiecki.designpatters.builder;

public class FordFactory {

    private static final VehicleBuilder builder;

    static {
        builder = new VehicleBuilder();
        builder.setBrand("Ford");
    }

    public static Vehicle getKa(String registration) {
        return get("Ka", registration);
    }

    public static Vehicle getMustang(String registration) {
        return get("Mustang", registration);
    }

    private static Vehicle get(String type, String registration) {
        return builder.setType(type).setRegistration(registration).build();
    }
}
