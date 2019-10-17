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

    // unique length invliad
    @Test
    public void test_unique_length_invalid() {
        Type actual = Triangle.classify(1, 2, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test_unique_length_invalid1() {
        Type actual = Triangle.classify(1, 7, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test_unique_length_invalid2() {
        Type actual = Triangle.classify(9, 2, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    // unique length valid
    @Test
    public void test_unique_length_valid1() {
        Type actual = Triangle.classify(12, 7, 8);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    // tran >  3 part 1
    @Test
    public void test_tran3_1() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    // trian == 1 && a + b > c)
    @Test
    public void test_ISO_1() {
        Type actual = Triangle.classify(10, 10, 1);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    // trian == 2 && a + c > b
    @Test
    public void test_ISO_2() {
        Type actual = Triangle.classify(10, 1, 10);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    // trian == 3 && b + c > a
    @Test
    public void test_ISO_3() {
        Type actual = Triangle.classify(1, 10, 10);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
    
    @Test
    public void INVALID() {
        Type actual = Triangle.classify(100, 10, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }


}


