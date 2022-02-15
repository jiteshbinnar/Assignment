package ParameterizedClass;

import CalculatorDemo.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParametersDemo{
    private int x,y, result;

    public ParametersDemo (int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Test
    public void testAdd() {
        Calculator instance = new Calculator();
        int actual=instance.addition(x,y);
        Assert.assertEquals(result, actual);
    }
    @Parameterized.Parameters
    public static Collection<Integer[]> getParameters(){
        Integer [][]inputArr;
        inputArr=new Integer[][]{{1,2,3},{-1,2,1},{2,2,3},{4,0,4}};
        return Arrays.asList(inputArr);
    }


}
