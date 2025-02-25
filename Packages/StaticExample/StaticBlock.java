package Packages.StaticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    //It will runs once when classes is loaded
    static {
        System.out.println("Static block is here");
        b = 5 * a;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a+"  "+StaticBlock.b);
    }
}
