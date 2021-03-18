package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class VehicleShowroom {
    private HashMap<String, Vehicle> vehicles;
    private int visitors;

    public VehicleShowroom(){
        vehicles = new HashMap<String, Vehicle>();
        visitors = 30; // default visitor number
    }

    public void addVehicle(Vehicle vehicle) {
        String modelNumber = vehicle.getModelNumber();
        this.vehicles.put(modelNumber, vehicle);
    }

    public void removeVehicle(String modelNumber){
        this.vehicles.remove(modelNumber);
    }

    public void setVisitor(int visitors) {
        this.visitors = visitors;
    }

    public int getVisitors() {
        int visitorCount = this.visitors;
        for (Vehicle vehicle : this.vehicles.values()) {
            if(vehicle.getVehicleType() == VehicleType.SPORTS) {
                visitorCount += 20;
            }
        }
        return visitorCount;
    }

    public void showVehicleList(){
        
        for (Vehicle vehicle : this.vehicles.values()) {
            System.out.println("Vehicle Type:" + vehicle.getVehicleType());
            System.out.println("Model Number:" + vehicle.getModelNumber());
            System.out.println("Engine Type:" + vehicle.getEngineType());
            System.out.println("Engine Displacement:" + vehicle.getEnginePower());
            System.out.println("Tyre Size:" + vehicle.getTyreSize());
            
        }
  
    }
}

