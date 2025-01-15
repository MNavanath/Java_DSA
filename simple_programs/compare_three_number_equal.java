package simple_programs;
import java.util.*;

public class compare_three_number_equal {
    public static boolean compareNumbers(int a, int b, int c){
        return (a == b) || (a == c) || (b == c);
    }
    public static void main(String[] args){
        assert(compareNumbers(10, 13, 99) == true);
        System.out.println("All the test cases in main function passed");
    }
}