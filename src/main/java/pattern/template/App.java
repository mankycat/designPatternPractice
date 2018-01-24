package pattern.template;

/**
 * Template pattern implementation practice
 * run with ./gradlew run after change the main package in build.gradle
 */
public class App {

    public static void main(String[] args){

        int[] numbers = new int[]{ 2 , 3 ,-5 , 7 , 4 , 10};

        Algorithm bubbleSort = new BubbleSort(numbers);

        bubbleSort.sort();

        Algorithm insertionSort = new InsertionSort(numbers);

        insertionSort.sort();

    }
}
