package Strings;

public class Pallindrome {
    public static void main(String[] args) {
      System.out.println(checkPallindrome());
    }

    static boolean checkPallindrome(){
        String name = "101";
        int start = 0;
        int end = name.length()-1;
        while(start <= end)
        {
            if(name.charAt(start) != (name.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
