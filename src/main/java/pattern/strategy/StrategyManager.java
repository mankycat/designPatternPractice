package pattern.strategy;

public class StrategyManager {

    private Strategy strategy;

    public StrategyManager(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(int num1 , int num2){
        this.strategy.operation(num1 , num2);
    }
}
