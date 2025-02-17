package RecursionLevel1;

public class productOfDigits {
    public static void main(String[] args) {

        System.out.println(pod(2324));
    }

    static int pod(int n){
        if (n % 10 == n){
            return n;
        }

        else{
            return n % 10 * pod(n/10);
        }
    }
}
