package AbstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }
    abstract void career();
    abstract void patrtner();

    void normal(){
        System.out.println("This is a normal method");
    }

    //we cant create static abstract methods
    //but we can create static maethods

    static void mail(){
        System.out.println("I am staic method in abstract class baby");
    }
}
