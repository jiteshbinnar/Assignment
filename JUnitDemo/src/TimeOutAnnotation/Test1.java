package TimeOutAnnotation;

import CalculatorDemo.Calculator;
import org.junit.Assert;
import org.junit.Test;
public class Test1 {
    @Test(timeout = 10)
    public void Add(){
        Calculator c=new Calculator();
        Assert.assertEquals(5,c.addition(2,3));
    }

    @Test(timeout = 7)
    public void Sub(){
        Calculator c=new Calculator();
        Assert.assertEquals(5,c.subtraction(10,5));
    }
}
