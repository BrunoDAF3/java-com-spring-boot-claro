import designpatterns.gof.singleton.SingletonHolder;
import designpatterns.gof.singleton.SingletonInitializeAfterCall;
import designpatterns.gof.singleton.SingletonInitializeBeforeCall;

public class TestDesignPatterns {

    public static void main(String[] args){

        SingletonInitializeAfterCall afterCall = SingletonInitializeAfterCall.getInstance();
        System.out.println(afterCall);
        afterCall = SingletonInitializeAfterCall.getInstance();
        System.out.println(afterCall);

        SingletonInitializeBeforeCall beforeCall = SingletonInitializeBeforeCall.getInstance();
        System.out.println(beforeCall);
        beforeCall = SingletonInitializeBeforeCall.getInstance();
        System.out.println(beforeCall);

        SingletonHolder holder = SingletonHolder.getInstance();
        System.out.println(holder);
        holder = SingletonHolder.getInstance();
        System.out.println(holder);
        

    }
}
