package compareString;

public class fin {
    public  static void main(String args[ ])
    {
        String s="my name is jitesh";
        String s1="i am a developer";
        if((s1.compareTo(s))>0)
            System.out.println("s1 is greater than s");
        else if (s.compareTo(s1)>0)
            System.out.println ("s is greater than s1");
        else
            System.out.println ("two strings are equal");

    }

}
