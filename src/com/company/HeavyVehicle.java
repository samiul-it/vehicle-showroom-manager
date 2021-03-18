package com.company;

public class HeavyVehicle extends Vehicle{
    private float weight;

    public HeavyVehicle(String modelNumber, EngineType engineType, int enginePower, int tyreSize, float weight){
        super(modelNumber, EngineType.DISEL, enginePower, tyreSize);
        this.setWeight(weight);
        this.setVehicleType(VehicleType.HEAVY);
    }

    protected float getWeight() {
        return weight;
    }

    protected void setWeight(float weight) {
        this.weight = weight;
    }
}

