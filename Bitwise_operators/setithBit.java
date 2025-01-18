package Bitwise_operators;

public class setithBit {
    public static void main(String[] args){
        int n = 13;
        int i = 1;
        System.out.println(setithbit(n, i));
    }

    static int setithbit(int n, int i){
        int mask = 1<<i;
        return n | mask;
        
    }
    
}
