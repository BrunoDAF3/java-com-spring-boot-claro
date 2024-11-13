package designpatterns.gof.strategy;

public class StrategyAccelerateCar implements Strategy {

    @Override
    public void action() {
        
        System.out.println("Accelerating the car");
        
    }

}
