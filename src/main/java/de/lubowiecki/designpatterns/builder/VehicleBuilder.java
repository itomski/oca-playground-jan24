package de.lubowiecki.designpatterns.builder;

public class VehicleBuilder {

    private String brand = "Unbekannt";
    private String type = "Unbekannt";
    private String registration = "Unbekannt";

    public String getBrand() {
        return brand;
    }

    public VehicleBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getType() {
        return type;
    }

    public VehicleBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public String getRegistration() {
        return registration;
    }

    public VehicleBuilder setRegistration(String registration) {
        this.registration = registration;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(brand, type, registration);
    }
}
