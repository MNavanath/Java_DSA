package Bitwise_operators;

public class findMagicNumber {
    public static void main(String[] args){
        int n = 2;

        int ans = 0;

        int base = 5;
        
        while (n>0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *= 5;
        }


        System.out.println(ans);
        
    }
}
