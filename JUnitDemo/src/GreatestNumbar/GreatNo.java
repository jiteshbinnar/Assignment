package GreatestNumbar;

public class GreatNo {


    public static int greatestNumber(int a, int b, int c)
    {
        if (a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;

    }
}
