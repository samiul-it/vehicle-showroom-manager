package com.company;

public class SportsVehicle extends Vehicle{
    private boolean turbo;

    public SportsVehicle(String modelNumber, EngineType engineType, int enginePower, int tyreSize, boolean turbo){
        super(modelNumber, EngineType.OIL, enginePower, tyreSize);
        this.setTurbo(turbo);
        this.setVehicleType(VehicleType.SPORTS);
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}

