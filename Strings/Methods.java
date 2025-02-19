package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Navanath Madakatte";
        System.out.println(Arrays.toString(name.toCharArray()));

        name = name.toLowerCase();

        System.out.println(name);

        System.out.println(name.toUpperCase());

        System.out.println(name);

        System.out.println(name.indexOf('a'));

        System.out.println("  name  ".strip());

        System.out.println(Arrays.toString(name.split(" ")));


    }
}
