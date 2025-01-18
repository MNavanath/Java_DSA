package Bitwise_operators;

public class resetithBit {
    public static void main(String[] args){
        int n = 13;
        int i = 0;
        System.out.println(resetithbit(n, i));
    }

    static int resetithbit(int n, int i){
        int mask = 1 << i;
        mask = ~mask;
        return n & mask;
    }
    
}
