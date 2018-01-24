package inheritance;

public abstract class Dad {

    protected String name = "Dad";

    public abstract void printName();

    public void printDadItSelf(){
        System.out.println("::Print By Dad it Self :" + name);
    }
}
