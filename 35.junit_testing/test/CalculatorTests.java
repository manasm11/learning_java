import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    @Test
    void test() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(2, 3);
        assertEquals(5, actual);
    }
}
