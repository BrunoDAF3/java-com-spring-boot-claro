package designpatterns.gof.singleton;

public class SingletonInitializeAfterCall {

    private static SingletonInitializeAfterCall instance;

    private SingletonInitializeAfterCall(){
        super();
    }

    public static SingletonInitializeAfterCall getInstance(){
        if (instance == null){

            instance = new SingletonInitializeAfterCall();
        }
        return instance;
    }

}
