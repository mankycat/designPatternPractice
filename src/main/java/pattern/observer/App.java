package pattern.observer;

/**
 * observer pattern implementation practice
 */
public class App {

    public static void main(String[] args){

        Subject subject = new Subject();

        new IntegerObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}