package Maths;

public class NewtonRaphson {
    public static void main(String[] args) {
        double n = 40;
        System.out.println("Square root of " + n + " is " + sqrt(n));
        
    }

    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.0001) {
                break;
            }
            x = root;
        }
        return root;
    }
}
