
package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**Test class for SimpleCalculator.*/
public class SimpleCalculatorTest {
    private static final int TEST1_INPUT1 = 2;
    private static final int TEST1_INPUT2 = 3;
    private static final int TEST1_RESULT = 5;
    private static final int TEST2_INPUT1 = 30;
    private static final int TEST2_INPUT2 = 24;
    private static final int TEST2_RESULT = 6;
    private static final int TEST3_INPUT1 = 5;
    private static final int TEST3_INPUT2 = 9;
    private static final int TEST3_RESULT = 45;
    private static final int TEST4_INPUT1 = 24;
    private static final int TEST4_INPUT2 = 24;
    private static final int TEST4_RESULT = 1;
    private static final int TEST5_INPUT_OUTPUT = 88;

    @Test
    public void test() {
        try {

            Assertions.assertEquals(TEST1_RESULT, SimpleCalculator.sum(TEST1_INPUT1, TEST1_INPUT2));
            Assertions.assertEquals(TEST2_RESULT, SimpleCalculator.sub(TEST2_INPUT1, TEST2_INPUT2));
            Assertions.assertEquals(TEST3_RESULT, SimpleCalculator.mul(TEST3_INPUT1, TEST3_INPUT2));
            Assertions.assertEquals(TEST4_RESULT, SimpleCalculator.div(TEST4_INPUT1, TEST4_INPUT2));
            Assertions.assertEquals(Math.log(TEST5_INPUT_OUTPUT), SimpleCalculator.log(TEST5_INPUT_OUTPUT));
        } catch (ArithmeticException e) {
            System.out.println("Exception detected: " + e);
        }
    }
}
