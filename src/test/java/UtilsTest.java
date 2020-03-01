import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void derivative() {
        int[] coefficients = {5, 2, 3, 1};
        final int [] derivativeCoefficients = Utils.derivative(coefficients);
        assertAll("derivative coefficients",
                () -> assertEquals(derivativeCoefficients[0], 15),
                () -> assertEquals(derivativeCoefficients[1], 4),
                () -> assertEquals(derivativeCoefficients[2], 3));
    }

    @Test
    void constantDerivative() {
        int[] coefficient = {1};
        final int [] derivativeCoefficients = Utils.derivative(coefficient);
        assertEquals(derivativeCoefficients[0], 0);
    }
}