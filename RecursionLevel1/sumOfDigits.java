package RecursionLevel1;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sod(76763));
    }

    static int sod(int n){
        if (n==0){
            return 0;
        }

        else{
            return n % 10 + sod(n/10);
        }
    }
}
