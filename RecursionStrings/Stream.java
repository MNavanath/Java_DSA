package RecursionStrings;

public class Stream {
    public static void main(String[] args) {
        skip("","Navanath");
        System.out.println(skip("Navanath"));
        System.out.println(skipapple("Navapplenath"));
        System.out.println(skipappifNotapple("Navapplnath"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }

    }


    //using return type

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch+skip(up.substring(1));
        }

    }

    //skipping substring

    static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }else{
            return up.charAt(0)+skipapple(up.substring(1));
        }

    }


    static String skipappifNotapple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")) {
            return skipappifNotapple(up.substring(3));
        }else{
            return up.charAt(0)+skipappifNotapple(up.substring(1));
        }

    }


}
