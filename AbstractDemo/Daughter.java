package AbstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become a coder");
    }

    @Override
    void patrtner() {
        System.out.println("I love iron man");
    }

}
