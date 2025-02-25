package Packages.StaticExample;


public class InnerClass {

    static class Test{
        String Name;

        Test(String name){
            this.Name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Java");
        Test b = new Test("Python");

        System.out.println(a.Name);
        System.out.println(b.Name);
    }
}


//you can put static for inner class but not outside class
//bcz outside classes dependent on any other class

