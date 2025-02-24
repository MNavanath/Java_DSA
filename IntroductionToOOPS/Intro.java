package IntroductionToOOPS;

import java.util.Arrays;
public class Intro {
    public static void main(String[] args) {

        Student student = new Student(12, "Navamath", 13);
        student.greeting();
    }
}

class Student{

    int rno;
    String name;
    int marks;

    void greeting(){
        System.out.println("Hello My name is "+this.name);
    }

    Student(){
        this.rno = 133;
        this.name = "Navamath";
        this.marks = 9;
    }

    Student(int rno,String name,int marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
