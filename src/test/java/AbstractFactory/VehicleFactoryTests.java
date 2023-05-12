package AbstractFactory;

import AbstractFactory.Abstractions.IVehicleFactory;
import AbstractFactory.Vehicles.RegularBike;
import AbstractFactory.Vehicles.RegularCar;
import AbstractFactory.Vehicles.SportsBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleFactoryTests {
    private IVehicleFactory _vehicleFactory;


    public VehicleFactoryTests(){

    }


    @Test
    public void CreateBike_ShouldCreateSportBike_WhenTheVehicleFactoryIsForSportVehicleFactory(){
        //arrange
        _vehicleFactory = new SportVehicleFactory();
        //Act
        var sportBike = _vehicleFactory.CreateBike();
        //Assert
        assertEquals(sportBike.getClass(), SportsBike.class);
    }

    @Test
    public void CreateBike_ShouldCreateRegularBike_WhenTheVehicleFactoryIsForRegularVehicleFactory(){
        //arrange
        _vehicleFactory = new RegularVehicleFactory();
        //Act
        var regularBike = _vehicleFactory.CreateBike();
        //Assert
        assertEquals(regularBike.getClass(), RegularBike.class);
    }

    @Test
    public void CreateCar_ShouldCreateRegularCar_WhenTheVehicleFactoryIsForRegularVehicleFactory(){
        //arrange
        _vehicleFactory = new RegularVehicleFactory();
        //Act
        var regularCar = _vehicleFactory.CreateCar();
        //Assert
        assertEquals(regularCar.getClass(), RegularCar.class);
    }

    @Test
    public void CreateCar_ShouldCreateSportsCar_WhenTheVehicleFactoryIsForSportsVehicleFactory(){
        //arrange
        _vehicleFactory = new RegularVehicleFactory();
        //Act
        var sportsCar = _vehicleFactory.CreateCar();
        //Assert
        assertEquals(sportsCar.getClass(), RegularCar.class);
    }

}
