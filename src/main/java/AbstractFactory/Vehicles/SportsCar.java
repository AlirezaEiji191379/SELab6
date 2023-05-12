package AbstractFactory.Vehicles;

import AbstractFactory.Abstractions.ICar;

public class SportsCar implements ICar {
    @Override
    public void GetDetails() {
        System.out.println("Sports Car");
    }
}
