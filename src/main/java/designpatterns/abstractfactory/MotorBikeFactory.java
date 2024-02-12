package designpatterns.abstractfactory;

public class MotorBikeFactory implements VehicleFactory{

    public Vehicle create(){
        return new MotorBike();
    }
}
