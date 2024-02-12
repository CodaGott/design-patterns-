package designpatterns.factorymethod;

public class CarFactory {

    public static Vehicle create(CarType carType){
        return switch (carType) {
            case BMW -> new BMW();
            case AUDI -> new Audi();
        };
    }

    public enum CarType{
        AUDI, BMW
    }
}
