package designpatterns.singleton;

public final class Singleton34 {


    private Singleton34(){

    }

    private static final class SingletonHolder{
        private static final Singleton34 SINGLETON = new Singleton34();
    }

    public static Singleton34 getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
