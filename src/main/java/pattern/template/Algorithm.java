package pattern.template;

public abstract class Algorithm {

    protected abstract void initialize();
    protected abstract void sorting();
    protected abstract void printResult();

    public void sort(){
        initialize();
        sorting();
        printResult();
    }

    protected void swap(int[] array , int indexA , int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
