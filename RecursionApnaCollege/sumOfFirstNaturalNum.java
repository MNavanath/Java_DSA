package RecursionApnaCollege;

public class sumOfFirstNaturalNum {
    public static void main(String[] args) {
        int ans = naturalSum(7);
        System.out.println(ans);
    }

    public static int  naturalSum(int n){
        if(n == 0){
            return 0;
        }

        return n + naturalSum(n-1);
    }
}
