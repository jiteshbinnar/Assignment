package CallByValu;

public class Main
{
    public static void main (String args [ ])
    {
        Test t=new Test();
        int a=4,b=7;
        System.out.println ("Before calling a="+a+" b="+b);
        t.meth(a,b);
        System.out.println ("After calling a="+a+" b="+b);
    }
}
