package designpatterns.abstractfactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = VehicleFactory.create(VehicleFactory.VehicleType.CAR);
        Vehicle v1 = factory.create();
        System.out.println(v1.getClass());

        VehicleFactory factory2 = VehicleFactory.create(VehicleFactory.VehicleType.MOTORBIKE);
        Vehicle v2 = factory2.create();
        System.out.println(v2.getClass());
    }
}
