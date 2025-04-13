import no4.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PositiveNumberTest {

    // Run test with multiple data
    @ParameterizedTest
    // List of data testing
    @CsvSource({
            "5, true",
            "1, true",
            "0, false",
            "-3, false",
            "-2323, false",
            "100, true",
            "-99, false",
            "-123, false"
    })
    void testIsPositiveInteger(int input, boolean expected) {
        boolean result = Calculator.isPositiveInteger(input);
        assertEquals(expected, result);
    }

    // Run test with multiple data
    @ParameterizedTest
    // List of data testing
    @CsvSource({
            "-5, true",
            "-1, true",
            "0, true",
            "-3, true",
            "-2323, true",
            "100, false",
            "-99, true",
            "-123, true"
    })
    void testIsNotPositiveInteger(int input, boolean expected) {
        System.out.println("Test isNotPositiveInteger: " + input);
        boolean result = Calculator.isPositiveInteger(input);
        assertNotEquals(expected, result);
    }
}
