package FinallyBlock;

public class A  {
    public static void main(String[] args) {
        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("hi jitesh");
            System.exit(0);
        }
        finally {
            System.out.println("bye");
        }
    }
}
