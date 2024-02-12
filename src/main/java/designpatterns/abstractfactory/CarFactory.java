package designpatterns.abstractfactory;

public class CarFactory implements VehicleFactory{

    public Vehicle create(){
        return new Car();
    }
}
