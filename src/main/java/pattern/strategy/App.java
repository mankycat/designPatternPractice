package pattern.strategy;

/**
 * Strategy pattern implementation practice
 */
public class App {

    public static void main(String[] args){
        StrategyManager add = new StrategyManager(new AddStrategy());
        add.execute(2 , 3);

        StrategyManager multiply = new StrategyManager(new MultiplyStrategy());
        multiply.execute(2 , 3);
    }
}
