package pattern.strategy;

public class AddStrategy implements Strategy {
    @Override
    public void operation(int num1, int num2) {
        System.out.println("Add Strategy result : " + (num1 + num2));
    }
}
