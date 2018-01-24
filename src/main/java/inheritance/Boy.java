package inheritance;

public class Boy extends Dad{

    @Override
    public void printName() {

        System.out.println("Before Change ::Print By Child Boy : " + super.name);
        super.printDadItSelf();
        super.name = "boy";

        System.out.println("After Change::Print By Child Boy : " + super.name);
        super.printDadItSelf();
    }
}
