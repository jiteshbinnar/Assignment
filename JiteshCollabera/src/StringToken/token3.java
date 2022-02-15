package StringToken;

import java.util.StringTokenizer;

public class token3 {
    public static void main(String[] args) {
        String s=new String("abc pqr xyz");
        StringTokenizer t=new StringTokenizer(s);
        System.out.println(t.countTokens());
        while (t.hasMoreTokens());
        System.out.println(t.nextToken());


    }

}
