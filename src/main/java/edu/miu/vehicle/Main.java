package edu.miu.vehicle;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("11111", "Leonardo");
        Owner owner2 = new Owner("22222", "Lorena");
        Owner owner3 = new Owner("33333", "GABRIEL");

        VehicleRegistration vr = new VehicleRegistration();
        vr.setOwners(owner1);
        vr.setOwners(owner2);
        vr.setOwners(owner3);



        Vehicle vehicle1  = owner1.setVehicle();
        vehicle1.add("PDX-123", "Chevrolet");
        vehicle1.add("PDX-124", "Toyota");

        Vehicle vehicle2  = owner2.setVehicle();
        vehicle2.add("ADX-123", "BRAND1");
        vehicle2.add("ADX-124", "BRAND@");

        for(Owner o: vr.getOwners()){
            System.out.println(o);
        }

    }
}
