package RecursionLevel1;

public class Nto1{
    public static void main(String[] args) {
        n_to_1(5);
        n_to_1_2(5);
    }

    static void n_to_1(int n){
        if (n==0){
            return;
        }

        System.out.print(n);
        
        n_to_1(n-1);
        System.out.println();
    }

    static void n_to_1_2(int n){
        if (n==0){
            return;
        }
        System.out.print(n);
        n_to_1_2(n-1);

    }
}