package designpatterns.abstractfactory;

public interface VehicleFactory {

    Vehicle create();

    static VehicleFactory create(VehicleType type){
        return switch (type) {
            case CAR -> new CarFactory();
            case MOTORBIKE -> new MotorBikeFactory();
        };
    }

    enum VehicleType{
        CAR, MOTORBIKE
    }
}
