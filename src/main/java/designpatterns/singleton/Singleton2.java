package designpatterns.singleton;

public final class Singleton2 {

    private static Singleton2 SINGLETON = null;
    private Singleton2(){

    }

    public static synchronized Singleton2 getInstance(String value){
        if (SINGLETON == null){
            SINGLETON = new Singleton2();
        }
        return SINGLETON;
    }

}
