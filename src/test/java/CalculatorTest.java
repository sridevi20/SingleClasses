import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(3 , 2, 6, 5);
    }
    @Test
    public void firstNum1(){
        assertEquals(3, calculator.getNum1());
    }
    @Test
    public void secondNum2(){
        assertEquals(2, calculator.getNum2());
    }
    @Test
    public void hasX(){
        assertEquals(6, calculator.getX(), 0.01);
    }
    @Test
    public void hasY(){
        assertEquals(5, calculator.getY(), 0.01);
    }
    @Test
    public void addToNumbers(){
        assertEquals(5, calculator.addToNums());
    }
    @Test
    public void substractToNumbers(){
        assertEquals(1, calculator.substractToNums());
    }
    @Test
    public void multiplyTonumbers(){
        assertEquals(6, calculator.multiplyToNums());
    }
    @Test
    public void divideToNumbers(){
        assertEquals( 1.2, calculator.divideToNums(), 0.01);
    }

}
