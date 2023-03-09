package p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class secondjavajunitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
		
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}
	

	@Test
	void test() {
		System.out.println("Inside Test");
	}

}
