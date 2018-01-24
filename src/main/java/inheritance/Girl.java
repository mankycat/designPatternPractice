package inheritance;

public class Girl extends Dad{

    @Override
    public void printName() {

        System.out.println("Before Change ::Print By Child Girl : " + super.name);
        super.printDadItSelf();
        super.name = "girl";

        System.out.println("After Change::Print By Child Girl : " + super.name);
        super.printDadItSelf();
    }

    @Override
    public void printDadItSelf(){
        System.out.println("Override ::Print By Dad it Self : chaos");
    }

}
