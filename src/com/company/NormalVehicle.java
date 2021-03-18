package com.company;

public class NormalVehicle extends Vehicle{
    public NormalVehicle(String modelNumber, EngineType engineType, int enginePower, int tyreSize){
        super(modelNumber, engineType, enginePower, tyreSize);
        this.setVehicleType(VehicleType.NORMAL);
    }
}

