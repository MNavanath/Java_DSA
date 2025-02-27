package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34);
        son.career();
        son.patrtner();
        son.normal();

        Daughter daughter = new Daughter(23);

        daughter.career();
        daughter.patrtner();


        //you cannot create object of an abstract class
        //but you can do somethisg like this Parent daughter = new Daughter(23);
        Parent.mail();

    }
}
