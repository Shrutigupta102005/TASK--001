package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderCalculatorTest {

    @Test
    void shouldCalculateTotal() {

        OrderCalculator calculator = new OrderCalculator();

        double result = calculator.calculateTotal(100, 3);

        assertEquals(300, result);
    }

    @Test
    void shouldCalculateAnotherTotal() {

        OrderCalculator calculator = new OrderCalculator();

        double result = calculator.calculateTotal(50, 2);

        assertEquals(100, result);
    }

    @Test
    void shouldRejectNegativeQuantity() {

        OrderCalculator calculator = new OrderCalculator();

        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.calculateTotal(100, -2)
        );
    }
}