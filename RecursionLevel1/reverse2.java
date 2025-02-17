package RecursionLevel1;

public class reverse2 {
    public static void main(String[] args) {
        System.out.println(rev2(1234));
        System.out.println(isPalindrome(123321));
        
    }

    static int rev2(int n){
        int digits = (int)Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if (n % 10 == n){
            return n;
        }

        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }

    static boolean isPalindrome(int n){

        return n == rev2(n);
    }
}
