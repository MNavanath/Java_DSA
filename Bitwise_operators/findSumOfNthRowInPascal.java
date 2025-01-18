package Bitwise_operators;

public class findSumOfNthRowInPascal {
    public static void main(String[] args){
        int n = 5;
        System.out.println(findsumofnthrownnpascal(n));
    }

    static int findsumofnthrownnpascal(int n){
        return 1 << n;

    }
    
}
