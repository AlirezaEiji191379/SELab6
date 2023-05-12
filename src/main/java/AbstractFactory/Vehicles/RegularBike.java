package AbstractFactory.Vehicles;

import AbstractFactory.Abstractions.IBike;

public class RegularBike implements IBike {
    @Override
    public void GetDetails() {
        System.out.println("Regular Bike!");
    }
}
