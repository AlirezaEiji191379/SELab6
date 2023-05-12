package Builder.Builders;

import Builder.Abstractions.IVehicleBuilder;
import Builder.Products.Vehicle;
import Builder.Products.VehicleEnum;

public class MotorCycleBuilder implements IVehicleBuilder {
    private Vehicle vehicle;
    public MotorCycleBuilder() {
        vehicle = new Vehicle(VehicleEnum.MotorCycle);
    }

    @Override
    public void BuildFrame() {
        vehicle.setFrames("motorcycle");
    }

    @Override
    public void BuildEngine() {
        vehicle.setEngine("500 cc");
    }

    @Override
    public void BuildWheels() {
        vehicle.setWheels("2");
    }

    @Override
    public void BuildDoors() {
        vehicle.setDoors("0");
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
