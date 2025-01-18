package Bitwise_operators;
public class findUnique {
    public static void main(String[] args){
        int[] arr = {2,3,4,3,2,6,4};
        System.out.println(findunique(arr));

    }

    public static int findunique(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique  ^= n;
        }
        return unique;
    }
}
