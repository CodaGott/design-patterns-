package designpatterns.singleton;

public final class Singleton3 {

    private static Singleton3 SINGLETON = null;
    private Singleton3(){

    }

    public static Singleton3 getInstance(String value) {
        if (SINGLETON == null) {
            synchronized (Singleton3.class) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton3();
                }
            }
        }
        return SINGLETON;
    }
}
