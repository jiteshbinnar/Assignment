package CalculatorDemo;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {
@Test
    public void AdditionTest()
    {
        int x=20;
        int y=30;
        int result=50;
  Calculator c=new Calculator();
  int finalResult=c.addition(x,y);
        Assert.assertEquals(result,finalResult);
    }

    @Test
    public void SubtractionTest()
    {
        int x=20;
        int y=30;
        int result=40;
        Calculator c=new Calculator();
        int finalResult=c.subtraction(x,y);
        Assert.assertEquals(result,finalResult);
    }
}
