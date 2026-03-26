import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultFizzBuzzTest {
    @Test
    void number0() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = ResultFizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void munber1() {
        int number = 3;
        String expected = "Fizz";
        String result = ResultFizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void number2() {
        int number = 5;
        String expected = "Buzz";
        String result = ResultFizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void number3() {
        int number = 7;
        String expected = "7";
        String result = ResultFizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}