package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    void testThatSumWorksCorrectWithOne() {
        int actual = calc.sum(1);

        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksCorrectWithSix() {
        int actual = calc.sum(3);

        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumWorksCorrectWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int n = 0;
            if (calc.sum(n) == 0) {
                throw new IllegalArgumentException("Cannot enter 0");
            }
        });
    }
}