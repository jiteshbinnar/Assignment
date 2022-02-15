package NumbersSwap;

public class Swapping {

    int x=10;
    int y=20;
    public  void swappingWithThirdVariable()
    {
        int temp=x;
        x=y;
        y=temp;
    }
    public void swappingWithoutThirdVariable()
    {
        x=x+y;
        y=x-y;
        x=x-y;
    }
    public void display()
    {
        System.out.println("the value of x "+x+" "+"the value of y "+y);

    }



}
