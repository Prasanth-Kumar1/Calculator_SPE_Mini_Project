import org.junit.*;

public class CalculatorTests {

    private calculator calculator;

    @Before
    public void setUp() {
        calculator = new calculator();
    }

    @Test
    public void testSqRt() {
        double a = 4;
        double expectedResult = 2.0;
        long result = calculator.sqRt(a);
        Assert.assertEquals(expectedResult, result);
        ;
    }

    @Test
    public void testFcat() {
        double a = 5;
        double expectedResult = 120.0;
        double result = calculator.fact(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testLog() {
        double a = 10;
        double expectedResult = 1.0;
        double result = calculator.log(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testPower() {
        double a = 4;
        double b = 6;
        double expectedResult = 4096.0;
        double result = calculator.pow(a, b);
        Assert.assertEquals(expectedResult, result);
    }
}