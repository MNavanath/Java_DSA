package Maths;

public class gcd_lcm {
    public static void main(String[] args) {
        
        int a = 12;
        int b = 15;
        System.out.println("GCD of "+a+" and "+b+" is "+gcd(a, b));
        System.out.println("LCM of "+a+" and "+b+" is "+lcm(a, b));
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }

        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }
}
