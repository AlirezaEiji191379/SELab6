package Builder.Abstractions;

import Builder.Products.Vehicle;

public interface IVehicleBuilder {

    void BuildFrame();
    void BuildEngine();
    void BuildWheels();
    void BuildDoors();

    Vehicle getVehicle();
}
