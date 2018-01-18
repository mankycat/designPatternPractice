package pattern.observer;

public class IntegerObserver extends Observer {

    public IntegerObserver(Subject subject){
        this.subject = subject;
        subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("Decimal : " + subject.getState());
    }
}
