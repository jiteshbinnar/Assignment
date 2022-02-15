package StringConcept;

public class StringConc
{
    public static void main(String[] args)
    {
        String s1="Svcj";
        String s2=s1;
        String s5="Svcj";
        String s3=new String("Svcj");
        String s4=new String("Svcj");
        System.out.println(s1==s5);          //comparison
        System.out.println(s1==s2);          //comparison
        System.out.println(s1.equals(s2));   //equalsTo
        System.out.println(s3==s4);          //comparion
        System.out.println(s3.equals(s4));    //equalsTO

    }

}
