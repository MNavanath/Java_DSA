package Inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l+" "+box.w+" "+box.h);
        BoxWieght box3 = new BoxWieght();
        BoxWieght box4 = new BoxWieght(1,2,3,4);
        System.out.println(box3.h+" "+box3.wieght);

        //it will call default constructor of prent class if we dont give explicitly super class object in child class
        BoxWieght box2 = new BoxWieght();
        System.out.println(box2.wieght+" "+box2.w);

        Box box5 = new BoxWieght(1,2,3,4);

        //there are many varibles in both parent and child
        //you are given access vraible that are in the refrence type i.e BoxWieght
        //hence you should have acess to weight variable
        //hence it also means,that the ones aretrying to access should be initilized
        //but here,when the obj itself is of type parent class,how will you call the child constructor
        //this is why error
//        BoxWieght box6 = new Box(1,2,4);
    }
}
