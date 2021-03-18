package com.company;

public class Vehicle {

    static Iterable<Integer> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private VehicleType vehicleType;
    private String modelNumber;
    private EngineType engineType;
    private int enginePower;
    private int tyreSize;

    public Vehicle(String modelNumber, EngineType engineType, int enginePower, int tyreSize){
        this.setModelNumber(modelNumber);
        this.setEngineType(engineType);
        this.setEnginePower(enginePower);
        this.setTyreSize(tyreSize);
    }

    protected VehicleType getVehicleType() {
        return vehicleType;
    }

    protected void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    protected String getModelNumber() {
        return modelNumber;
    }

    protected void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    protected EngineType getEngineType() {
        return engineType;
    }

    protected void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    protected int getEnginePower() {
        return enginePower;
    }

    protected void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    protected int getTyreSize() {
        return tyreSize;
    }

    protected void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }
}

