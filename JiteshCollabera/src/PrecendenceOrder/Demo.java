package PrecendenceOrder;

public class Demo {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        int c=10;
        float z=0;
        z=a+(++b)*((c/a)*b);
        System.out.println("the value of z is "+z);
    }

}
