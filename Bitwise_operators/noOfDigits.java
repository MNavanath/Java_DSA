//using log base 10

package Bitwise_operators;

public class noOfDigits {
    public static void main(String[] args){
        int n =3456;
        int base = 2;
        int ans = (int)(Math.log(n)/Math.log(base)) + 1;
        System.out.println(ans);

    }
    
}
