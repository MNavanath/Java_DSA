//Find out its odd or even using bitwise operator
package Bitwise_operators;

public class oddEven  {
    public static void main(String[] args){
        int n = 67;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n  & 1) == 1;
    }
    
}
