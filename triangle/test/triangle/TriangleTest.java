package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

	Triangle myTriangle = new Triangle();
	
	// Line Coverage
	@Test
	public void test1() {
		
		Type actual = Triangle.classify(-1, 1, 1);
        Type expected = INVALID;
        assertEquals(actual, expected);
	}

	@Test
	public void test2() {
		Type actual = Triangle.classify(1, 1, 1);
		Type expected = EQUILATERAL;
		assertEquals(actual, expected);
		
	}

	@Test
	public void test3() {
		Type actual = Triangle.classify(1, 2, 3);
		Type expected = INVALID;
		assertEquals(actual, expected);

	}

	@Test
	public void test4() {
		Type actual = Triangle.classify(55, 100, 56);
		Type expected = SCALENE;
		assertEquals(actual, expected);
	}

	@Test
	public void test5() {
		Type actual = Triangle.classify(2, 2, 3);
		Type expected = ISOSCELES;
		assertEquals(actual, expected);
	}

	@Test
	public void test6() {
		Type actual = Triangle.classify(2, 3, 2);
		Type expected = ISOSCELES;
		assertEquals(actual, expected);
	}

	@Test
	public void test7() {
		Type actual = Triangle.classify(3, 2, 2);
		Type expected = ISOSCELES;
		assertEquals(actual, expected);
	}

	@Test
	public void test8() {
		Type actual = Triangle.classify(2, 5, 2);
		Type expected = INVALID;
		assertEquals(actual, expected);
	}

}