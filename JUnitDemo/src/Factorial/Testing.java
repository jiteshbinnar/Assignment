package Factorial;

import org.junit.Assert;
import org.junit.Test;

public class Testing {
    @Test
    public void Fact(){
        FactorialNum f=new FactorialNum();
        int result=24;
        int expResult=f.fact(4);
        Assert.assertEquals(expResult,result);

    }
}
