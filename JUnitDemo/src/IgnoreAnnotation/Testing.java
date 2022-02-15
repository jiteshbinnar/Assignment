package IgnoreAnnotation;

import CalculatorDemo.Calculator;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Testing {
    @Test
    public void multiplicationTest1()
    {
        int x=30;
        int y=20;
        int result=600;
        Calculator c=new Calculator();
        int finalResult=c.multiplication(x,y);
        Assert.assertEquals(result,finalResult);
    }

    @Test
    @Ignore
    public void modularTest1()
    {
        int x=30;
        int y=20;
        int result=600;
        Calculator c=new Calculator();
        int finalResult=c.modular(x,y);
        Assert.assertEquals(result,finalResult);
    }

}
