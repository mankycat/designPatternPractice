package inheritance;

public class App {

    public static void main(String[] args){

        Dad personG = new Girl();

        personG.printDadItSelf();

        personG.printName();

        personG.printDadItSelf();

        System.out.println("----------------------------");

        Dad personB = new Boy();

        personB.printDadItSelf();

        personB.printName();

        personB.printDadItSelf();

    }
}
