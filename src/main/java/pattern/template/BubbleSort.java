package pattern.template;

public class BubbleSort extends Algorithm {

    private int[] numbers;

    public BubbleSort(int[] numbers){
        this.numbers = numbers;
    }


    @Override
    public void initialize() {
        System.out.println("Initializing bubble sort ...");
    }

    @Override
    public void sorting() {
        int length = this.numbers.length;
        for(int i = length -1 ; i > 0 ; --i){
            for(int j = 0 ; j < i ; ++j){
                if(numbers[j] > numbers[i]){
                    swap(numbers , j , i);
                }
            }
        }
    }

    @Override
    public void printResult() {
        for(Integer i : numbers){
            System.out.print(i.intValue() + " ");
        }
        System.out.println();
    }


}
