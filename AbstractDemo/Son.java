package AbstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }

    @Override
    void career() {

        System.out.println("I want to become a Docotor");
    }

    @Override
    void patrtner() {
        System.out.println("I love peeper pots");
    }
}
