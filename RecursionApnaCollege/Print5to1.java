package RecursionApnaCollege;

public class Print5to1 {
    public static void main(String[] args) {
        printNum(5);
    }

    public static void printNum(int n){
        if(n==0||n==-1){
            return;
        }
        System.out.println(n);
        printNum(n-1);
        printNum(n-2);
    }
}
