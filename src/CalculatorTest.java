import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
	@Test
	public void testAdd(){
		Calculator calc = new Calculator();
		assertTrue(calc.add(3, 7) == 10);
	}
	
	@Test
	public void testSubtract(){
		Calculator calc = new Calculator();
		assertTrue(calc.subtract(5, 3) == 2);
		assertTrue(calc.subtract(5, 10) == -5);
	}
	
	@Test
	public void testMultiply(){
		Calculator calc = new Calculator();
		assertTrue(calc.multiply(2, 300) == 600);
	}
}
