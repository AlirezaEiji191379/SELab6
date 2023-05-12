package Builder.Builders;

import Builder.Abstractions.IVehicleBuilder;
import Builder.Products.Vehicle;
import Builder.Products.VehicleEnum;

public class CarBuilder implements IVehicleBuilder {
    private Vehicle vehicle;

    public CarBuilder() {
        this.vehicle = new Vehicle(VehicleEnum.Car);
    }

    @Override
    public void BuildFrame() {
        vehicle.setFrames("Car frames");
    }

    @Override
    public void BuildEngine() {
        vehicle.setEngine("2500 cc");
    }

    @Override
    public void BuildWheels() {
        vehicle.setWheels("4");
    }

    @Override
    public void BuildDoors() {
        vehicle.setDoors("4");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
