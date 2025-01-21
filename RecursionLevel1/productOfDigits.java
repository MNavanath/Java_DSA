package RecursionLevel1;

public class productOfDigits {
    public static void main(String[] args) {
        System.out.println(pod(3333));
    }

    static int pod(int n){
        if (n == 0){
            return 1;
        }

        else{
            return n % 10 * pod(n/10);
        }
    }
}
