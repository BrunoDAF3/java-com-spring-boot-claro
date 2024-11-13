import designpatterns.gof.singleton.SingletonHolder;
import designpatterns.gof.singleton.SingletonInitializeAfterCall;
import designpatterns.gof.singleton.SingletonInitializeBeforeCall;
import designpatterns.gof.strategy.Car;
import designpatterns.gof.strategy.StrategyAccelerateCar;
import designpatterns.gof.strategy.StrategyBrakeCar;

public class TestDesignPatterns {

    public static void main(String[] args){

        // Testing Singleton pattern
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
        


        //Testing Strategy pattern
        StrategyAccelerateCar accelerate = new StrategyAccelerateCar();
        StrategyBrakeCar brake = new StrategyBrakeCar();

        Car car = new Car();

        car.setStrategy(accelerate);
        car.action();
        car.action();
        car.setStrategy(brake);
        car.action();
        car.action();
        car.setStrategy(accelerate);
        car.action();


    }
}
