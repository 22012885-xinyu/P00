import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a,b);
			
			int expected = 5555;
			assertEquals (expected,actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b);
			
			int expected = -7531;
	}
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.multiply(a, b);
			
			int expected = 10816010;
			assertEquals(expected,actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b);
			
			int expected = (int) 0.14078722190530519110096976611523;
			assertEquals(expected,actual);
	}

}
