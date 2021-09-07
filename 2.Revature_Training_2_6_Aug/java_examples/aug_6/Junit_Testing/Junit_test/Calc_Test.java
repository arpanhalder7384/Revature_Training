package Junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Calcculator.*;

class Calc_Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
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
	void testAdd() {
		assertEquals(8,Calculator_t.add(5, 3),"Incorrect Result");
	}
	
	@Test
	void tesAddPositiveNumbers_WhenNegativeArguments() {
		try {
			Calculator_t.addPositiveNumbers(-5,-3);
			fail("No Exception Thrown");
		}
		catch(IllegalArgumentException e){
//			assertEquals("Negative Numbers Not allowed", e.getMessage());
			assertTrue(true);
		}
	}
	
	@Test
	void tesAddPositiveNumbers_WhenPositiveArguments() {
		assertEquals(8,Calculator_t.add(5, 3),"Incorrect Result");
	}
}
