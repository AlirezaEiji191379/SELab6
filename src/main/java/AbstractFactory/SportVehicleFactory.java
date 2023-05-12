package AbstractFactory;

import AbstractFactory.Abstractions.IBike;
import AbstractFactory.Abstractions.ICar;
import AbstractFactory.Abstractions.IVehicleFactory;
import AbstractFactory.Vehicles.SportsBike;
import AbstractFactory.Vehicles.SportsCar;

public class SportVehicleFactory implements IVehicleFactory {
    @Override
    public IBike CreateBike() {
        return new SportsBike();
    }

    @Override
    public ICar CreateCar() {
        return new SportsCar();
    }
}
