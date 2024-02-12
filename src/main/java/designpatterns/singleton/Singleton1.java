package designpatterns.singleton;

public final class Singleton1 {

    private static Singleton1 SINGLETON = null;
    private Singleton1(){

    }

    public static Singleton1 getInstance(String value){
        if (SINGLETON == null){
            SINGLETON = new Singleton1();
        }
        return SINGLETON;
    }
}
