package Builder;

import Builder.Abstractions.IVehicleBuilder;
import Builder.Abstractions.IVehicleBuilderDirector;

public class VehicleBuilderDirector implements IVehicleBuilderDirector {
    @Override
    public void Construct(IVehicleBuilder vehicleBuilder) {
        vehicleBuilder.BuildFrame();
        vehicleBuilder.BuildDoors();
        vehicleBuilder.BuildEngine();
        vehicleBuilder.BuildWheels();
    }
}
