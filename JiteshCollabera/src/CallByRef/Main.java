package CallByRef;

public class Main {
    public static void main(String args [ ])
    {    Testing t=new Testing(4,5);
        System.out.println("Before calling a="+t.a+" b="+t.b);
        t.method(t);
        System.out.println("After calling a="+t.a+" b="+t.b);
    }
}
