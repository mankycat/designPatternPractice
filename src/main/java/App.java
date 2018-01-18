

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;


public class App {

    public static void main(String[] args){

        List<String> list = Arrays.asList(
                "blue", "red", "green", "yellow", "orange", "cyan", "purple"
        );
        Observable observable = Observable.just(list);
        observable.subscribe(System.out::println);

    }
}
