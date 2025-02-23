package BasicPrograms;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roll = sc.nextInt();
        String name = sc.next();
        float marks = sc.nextFloat();

        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);
    }
}
