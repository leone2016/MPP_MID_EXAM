package edu.miu.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRegistration {
    private List<Owner> owners;

    public VehicleRegistration() {
        this.owners = new ArrayList<>();
    }

    public List<Owner> getOwners() {
        return owners;
    }

//    public void isVehicleRegister(String plates) throws IllegalArgumentException {
//        boolean result = false;
//        for(Owner owner : this.owners) {
//            for( Vehicle vehicle: owner.getVehicles()){
//                if(vehicle.getPlates().equals(plates)){
//                    throw new IllegalArgumentException("Vehicle already been registered");
//                }
//            }
//        }
//    }

    public void setOwners(Owner owners) {
        this.owners.add(owners);
    }
}
