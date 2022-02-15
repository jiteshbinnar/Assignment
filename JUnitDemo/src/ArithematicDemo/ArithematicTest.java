package ArithematicDemo;

import org.junit.Assert;
import org.junit.Test;

public class ArithematicTest {
    @Test
    public void test()
    {
        int expResult = 2;
        Arithematic a = new Arithematic();
        double result = a.findSquareroot(4);
      Assert.assertEquals(expResult,result,0.0);
    }
}
