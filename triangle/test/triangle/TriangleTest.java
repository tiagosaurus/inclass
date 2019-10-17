package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {
    // basic test
    @Test
    public void test1() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    // invalid inputs
    @Test
    public void test_invalid_input1() {
        Type actual = Triangle.classify(-1, 10, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
    @Test
    public void test_invalid_input2() {
        Type actual = Triangle.classify(10, -1, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
    @Test
    public void test_invalid_input3() {
        Type actual = Triangle.classify(10, 10, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    // equal input
    public void test_input_equal1() {
        Type actual = Triangle.classify(10, 10, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    public void test_input_equal2() {
        Type actual = Triangle.classify(10, 10, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    public void test_input_equal2() {
        Type actual = Triangle.classify(10, 10, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }


}
