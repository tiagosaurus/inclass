  
package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest2 extends TriangleTest {

	@Test
	public void test9() {
		Type actual = Triangle.classify(1, -1, 1);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test10() {
		Type actual = Triangle.classify(1, 1, -1);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test11() {
		Type actual = Triangle.classify(2, 6, 3);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test12() {
		Type actual = Triangle.classify(7, 2, 3);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test13() {
		Type actual = Triangle.classify(2, 2, 5);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

	@Test
	public void test14() {
		Type actual = Triangle.classify(5, 2, 2);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}
	
}