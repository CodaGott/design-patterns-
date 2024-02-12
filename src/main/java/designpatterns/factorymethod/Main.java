package designpatterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        var c1 = CarFactory.create(CarFactory.CarType.AUDI);
        var c2 = CarFactory.create(CarFactory.CarType.BMW);
        System.out.println(c1);
        System.out.println(c2);
    }
}
