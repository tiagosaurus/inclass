  
package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest3 extends TriangleTest2 {

	// Mutations Testing
	@Test
	public void test15() {
		Type actual = Triangle.classify(1, 1, 0);
		Type expected = INVALID;
		assertEquals(actual, expected);	
	}
	
	@Test
	public void test16() {
		Type actual = Triangle.classify(1, 2, 555);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test17() {
		Type actual = Triangle.classify(555, 555, 1420);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test18() {
		Type actual = Triangle.classify(2, 3, 1);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test19() {
		Type actual = Triangle.classify(3, 2, 5);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test20() {
		Type actual = Triangle.classify(7, 3, 3);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test21() {
		Type actual = Triangle.classify(1, 2, 1);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test22() {
		Type actual = Triangle.classify(2, 1, 1);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test23() {
		Type actual = Triangle.classify(0, 1, 1);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test24() {
		Type actual = Triangle.classify(1, 0, 1);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test25() {
		Type actual = Triangle.classify(0, 0, 0);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test26() {
		Type actual = Triangle.classify(5, 9, 2);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test27() {
		Type actual = Triangle.classify(7, 4, 3);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test28() {
		Type actual = Triangle.classify(3, 8, 3);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
	@Test
	public void test29() {
		Type actual = Triangle.classify(1, 1, 2);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

}