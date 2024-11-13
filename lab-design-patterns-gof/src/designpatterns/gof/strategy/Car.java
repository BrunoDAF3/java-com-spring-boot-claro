package designpatterns.gof.strategy;

public class Car {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){

        this.strategy = strategy;

    }

    public void action(){

        strategy.action();

    }

}
