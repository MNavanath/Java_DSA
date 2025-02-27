package Interfaces.ExtendDemo2;

public interface A {

    //call via the interface name
    static void method(){
        System.out.println("Hey i am static mehtod in interface ");
    }
    default void greet(){
        System.out.println("I am in a ");
    }
}
