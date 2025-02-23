package ConditionsLoops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int original = num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum = sum * 10 + rem ;
            num = num /10;

        }

        System.out.println(sum);
        if (sum == original){
            System.out.println("It is Pallindrome");
        }else{
            System.out.println("Not a pallindrome");
        }
    }
}
