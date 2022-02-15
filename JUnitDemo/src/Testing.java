import CalculatorDemo.Calculator;
import org.junit.*;

public class Testing {
    int x=0;
    int y=0;
    int result=0;
    Calculator calculator =null;
    @BeforeClass
    public static void setupClassLevel(){
        System.out.println("Invoke before loading class in JVM");
    }
    @Before
    public void setup(){
        x=30;
        y=20;
        calculator =new Calculator();
    }
    @Test
    public void additionTest(){
        result=50;
        int finalResult=calculator.addition(x,y);
        Assert.assertEquals(result, finalResult);
    }
    @Test
    public  void subtractionTest(){
        result=10;
        int finalResult=calculator.subtraction(x,y);
        Assert.assertEquals(result, finalResult);
//        Assert.assertFalse(result!=finalResult);
//        Assert.assertNull("delete",calculator);
    }
    @After
    public void cleaning(){
        x=0;
        y=0;
        calculator =null;
    }
    @AfterClass
    public static void setupAfterClassLevel(){
        System.out.println("Invoke After class loading class in JVM");
    }

}
