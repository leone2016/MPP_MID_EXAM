package edu.miu.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String dni;
     private String name;
    private List<Vehicle> vehicles;

    public Owner(String dni, String name) {
        this.dni = dni;
        this.name = name;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void registerVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public Vehicle setVehicle() {
        return new Vehicle(this);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
}
