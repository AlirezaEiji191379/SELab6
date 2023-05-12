package AbstractFactory.Vehicles;

import AbstractFactory.Abstractions.IBike;

public class SportsBike implements IBike {
    @Override
    public void GetDetails() {
        System.out.println("Sports Bike!");
    }
}
