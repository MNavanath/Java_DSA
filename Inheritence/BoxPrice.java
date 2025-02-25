package Inheritence;

public class BoxPrice extends BoxWieght{
    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l,double w,double h,double we,double c){
        super(l,w,h,we);
        this.cost = c;

    }

    BoxPrice(double side,double we,double cost){
        super(side,we);
        this.cost = cost;
    }



}
