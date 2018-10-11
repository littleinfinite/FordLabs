import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

class CalculatorTest {

	
	@Test
	void test() {
		
		Calculator calculator = new Calculator();
		
		double result = calculator.multiply(2.0, 3.0);
		
		assertEquals( 6.0 , result, 0);
	}

}
