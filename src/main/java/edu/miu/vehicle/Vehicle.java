package edu.miu.vehicle;

public class Vehicle {
    private String plates;
    private String branch;
    private Owner owner;

    public Vehicle(Owner owner) {
        this.owner = owner;
    }

    public void add(String plates, String branch) {
        this.plates = plates;
        this.branch = branch;
        this.owner.registerVehicle(this);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                ", plates='" + plates + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
