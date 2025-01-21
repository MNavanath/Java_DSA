package RecursionLevel1;

public class concept {
    public static void main(String[] args) {
        
    }

    static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        //fun(n--); // This will cause an infinite loop
        fun(--n); // This will work
    }
}
