package models;

public class Vehicle {
    String registrationNumber;
    String color;
    VehicleType vehicleType;

    public Vehicle(String registrationNumber, String color, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.vehicleType = vehicleType;
    }
}
