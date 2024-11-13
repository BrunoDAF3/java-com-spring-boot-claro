package designpatterns.gof.singleton;

public class SingletonInitializeBeforeCall {

    private static final SingletonInitializeBeforeCall instance = new SingletonInitializeBeforeCall();

    private SingletonInitializeBeforeCall(){
        super();
    }

    public static SingletonInitializeBeforeCall getInstance(){
        return instance;
    }

}
