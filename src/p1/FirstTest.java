package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstTest {

	@Test
	void testIntegerSum() {
		//System.out.println("my test");
		Calculator calc= new Calculator();
		int value= calc.sum(5,5);
		assertEquals(10,value);
	}

}
