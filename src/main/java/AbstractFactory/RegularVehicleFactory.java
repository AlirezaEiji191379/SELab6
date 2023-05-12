package AbstractFactory;

import AbstractFactory.Abstractions.IBike;
import AbstractFactory.Abstractions.ICar;
import AbstractFactory.Abstractions.IVehicleFactory;
import AbstractFactory.Vehicles.RegularBike;
import AbstractFactory.Vehicles.RegularCar;

public class RegularVehicleFactory implements IVehicleFactory {
    @Override
    public IBike CreateBike() {
        return new RegularBike();
    }

    @Override
    public ICar CreateCar() {
        return new RegularCar();
    }
}
