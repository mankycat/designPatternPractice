package pattern.template;

public class InsertionSort extends Algorithm {

    private int[] numbers;

    public InsertionSort(int[] numbers){
        this.numbers = numbers;
    }

    @Override
    public void initialize() {

        System.out.println("Initializing insertion sort ...");
    }

    @Override
    public void sorting() {
        int temp , j;
        for(int i = 1 ; i < numbers.length ; ++i){
            temp = numbers[i];
            for(j = i-1 ; j >= 0 && numbers[j] > temp ; --j ){
                numbers[j+1] = numbers[j];
            }
            numbers[j+1] = temp;
        }
    }

    @Override
    public void printResult() {
        for(Integer i : numbers){
            System.out.print( i + " ");
        }
        System.out.println();
    }
}
