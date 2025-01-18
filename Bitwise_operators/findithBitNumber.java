package Bitwise_operators;

public class findithBitNumber {
    public static void main(String[] args){
        int n = 13;
        int i = 2;
        System.out.println(findithbit(n, i));
    }

    static int findithbit(int n, int i){
        int mask = 1 << i;
        return (n & mask) == 0 ? 0 : 1;
    }
}


