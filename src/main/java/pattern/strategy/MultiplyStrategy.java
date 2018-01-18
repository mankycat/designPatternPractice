package pattern.strategy;

public class MultiplyStrategy implements Strategy {
    @Override
    public void operation(int num1, int num2) {
        System.out.println("Multiply Strategy result :" + (num1 * num2));
    }
}
