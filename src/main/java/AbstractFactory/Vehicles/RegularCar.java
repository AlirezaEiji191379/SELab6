package AbstractFactory.Vehicles;

import AbstractFactory.Abstractions.ICar;

public class RegularCar implements ICar {

    @Override
    public void GetDetails() {
        System.out.println("Regular Car");
    }
}
