package AbstractFactory.Abstractions;

public interface IVehicleFactory {
    IBike CreateBike();
    ICar CreateCar();
}
