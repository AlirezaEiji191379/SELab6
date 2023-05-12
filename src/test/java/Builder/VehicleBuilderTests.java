package Builder;

import AbstractFactory.VehicleFactoryTests;
import Builder.Abstractions.IVehicleBuilder;
import Builder.Abstractions.IVehicleBuilderDirector;
import Builder.Builders.CarBuilder;
import Builder.Builders.MotorCycleBuilder;
import Builder.Products.VehicleEnum;
import org.junit.jupiter.api.Test;

import static Builder.Products.VehicleEnum.Car;
import static Builder.Products.VehicleEnum.MotorCycle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class VehicleBuilderTests {

    private IVehicleBuilderDirector _vehicleBuilderDirector;
    private IVehicleBuilder _vehicleBuilder;


    public VehicleBuilderTests(){
        _vehicleBuilderDirector = new VehicleBuilderDirector();
    }

    @Test
    public void Build_ShouldCreateCar_WhenWeWantToCreateCar(){
        //Arrange
        _vehicleBuilder = new CarBuilder();
        //Act
        _vehicleBuilderDirector.Construct(_vehicleBuilder);
        //Assert
        var car = _vehicleBuilder.getVehicle();
        assertEquals(car.getVehicleType(), Car);
    }


    @Test
    public void Build_ShouldCreateMotorCycle_WhenWeWantToCreateMotorCycle(){
        //Arrange
        _vehicleBuilder = new MotorCycleBuilder();
        //Act
        _vehicleBuilderDirector.Construct(_vehicleBuilder);
        //Assert
        var car = _vehicleBuilder.getVehicle();
        assertEquals(car.getVehicleType(), MotorCycle);
    }

}
