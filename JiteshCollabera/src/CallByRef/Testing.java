package CallByRef;

public class Testing {
        int a,b;
        Testing(int i,int j)
        {    a=i;
            b=j;
        }
        void method( Testing of)
        {    of.a=a*2;
            of.b=b/2;
        }
}
