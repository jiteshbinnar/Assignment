package StringToken;
import java .util.*;
public class token {

    public static void main(String args[ ])
        {
            String s=new String("abc def gh");
            StringTokenizer t=new StringTokenizer(s);
            System.out.println(t.countTokens());
            while(t.hasMoreTokens());
            System.out.println(t.nextToken());
        }
}
