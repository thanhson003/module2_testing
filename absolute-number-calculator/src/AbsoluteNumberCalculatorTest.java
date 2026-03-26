import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -20;
        int expected = 20;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}

/*  number là biến chứa giá trị đầu vào.
    expected là biến chứa giá trị mong muốn..
    result là biến chứa giá trị thực tế do phương thức findAbsolute() tính toán và trả về
    phương thức assertEquals() được sử dụng để so sánh giá trị mong muốn và giá trị thực tế*/
