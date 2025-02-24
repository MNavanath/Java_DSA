package Packages.StaticExample;

public class Human {
    int age;
    String Name;
    int Salary;
    boolean Married;
    static long population;

    public Human(int age,String name,int salary,boolean m){
        this.age = age;
        this.Name = name;
        this.Salary = salary;
        this.Married = m;
        Human.population+= 1;
    }


}
