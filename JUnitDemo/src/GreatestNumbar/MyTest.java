package GreatestNumbar;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    @Test
    public void Testing() {
        int a = 20;
        int b = 30;
        int c = 40;
        int result=a;


        int finalResult=GreatNo.greatestNumber(a,b,c);
        Assert.assertEquals(result,finalResult);


    }

}
