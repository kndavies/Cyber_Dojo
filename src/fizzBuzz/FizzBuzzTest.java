package fizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFirstNumberEquals1() {
        assertEquals("1", FizzBuzz.answer(1));
    }

    @Test
    public void testThirdNumberEqualsFizz()  {
        assertEquals("Fizz", FizzBuzz.answer(3));
    }

    @Test
    public void testFifthNumberEqualsBuzz()  {
        assertEquals("Buzz", FizzBuzz.answer(5));
    }

    @Test
    public void testFifteenthNumberFizzBuzz()  {
        assertEquals("FizzBuzz", FizzBuzz.answer(15));
    }

    @Test
    public void testOutputForNumbersUpTo15() {
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", FizzBuzz.showOutput(1, 15));
    }
}
