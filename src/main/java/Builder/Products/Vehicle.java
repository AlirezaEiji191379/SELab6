package Builder.Products;

public class Vehicle {
    private VehicleEnum vehicleType;
    private String wheels;
    private String engine;
    private String doors;
    private String frames;

    public Vehicle(VehicleEnum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleEnum getVehicleType(){
        return vehicleType;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getFrames() {
        return frames;
    }

    public void setFrames(String frames) {
        this.frames = frames;
    }
}
