package Inheritence;

public class BoxWieght extends Box {
    double wieght;

    BoxWieght(){
        this.wieght = -1;
    }

    BoxWieght(double l,double w, double h,double we){
        super(l,w,h); //what is this? // call the parent class constructor
        //used to initilize the values present in the parent class
        this.wieght = we;

    }

    BoxWieght(double side,double we){
        super(side);
        this.wieght = wieght;
    }

    public BoxWieght(BoxPrice other) {
        super(other);
        wieght = other.wieght;
    }
}
