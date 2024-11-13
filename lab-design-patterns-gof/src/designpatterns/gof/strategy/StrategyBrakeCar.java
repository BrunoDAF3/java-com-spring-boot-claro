package designpatterns.gof.strategy;

public class StrategyBrakeCar implements Strategy {

    @Override
    public void action() {
        
        System.out.println("Braking the car");

    }

}
