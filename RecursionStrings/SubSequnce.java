package RecursionStrings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequnce {
    public static void main(String[] args) {
//        subseq("","Nav");
        subseqAscii("","Nav");
//        System.out.println(subseq1("","Nav"));
        System.out.println(subseqAsciiRet("", "abc"));

    }

    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }

    static ArrayList<String> subseq1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseq1(p+ch,up.substring(1));
        ArrayList<String> right = subseq1(p,up.substring(1));

        left.addAll(right);
        return left;

    }

    static void subseqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));

    }


    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
