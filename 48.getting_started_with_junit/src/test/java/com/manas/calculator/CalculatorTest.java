package com.manas.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddPositiveToPositive() {
        // Arrange
        int sum;

        // Act
        sum = calculator.add(12, 54);

        // Assert
        Assertions.assertEquals(66, sum);

    }


}
