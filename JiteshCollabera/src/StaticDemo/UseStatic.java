package StaticDemo;

public class UseStatic
{
    static int  a=5;
    static int b;
    static void num (int x){
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);
        System.out.println("the value of x is "+x);
    }
    static {
        System.out.println("Static block initialized first");
           b=a*4;
    }


}
