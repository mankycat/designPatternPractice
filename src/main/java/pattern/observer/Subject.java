package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    private int state;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void subscribe(Observer observer){
        observerList.add(observer);
    }

    public void dispose(Observer observer){
        observerList.remove(observer);
    }

    public void notifyAllObserver(){
        for(Observer o : observerList){
            o.update();
        }
    }
}
