package designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(). new Builder()
                .id(1)
                .name("Alcohol")
                .color("Red")
                .build();

        Product p2 = new Product(). new Builder()
                .id(2)
                .name("Water")
                .color("None")
                .build();
    }
}
