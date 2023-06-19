package org.lessons.java.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator(); // Inizializza l'istanza di Calculator
    }


    @Test
    public void testAdd() {
        assertEquals(8, 1 + 7, "La somma deve essere 8");
    }

    @Test
    public void testMultiply() {
        assertEquals(8, 4 * 2, "La moltiplicazione deve essere 8");
    }


    @Test
    public void testDivide() {
        assertEquals(8, 16 / 2, "La divisione deve essere 8");
    }

    @Test
    public void testSubtract() {
        assertEquals(8, 16 - 8, "La sottrazione deve essere 8");
    }


    @Test
    @DisplayName("fallisci")
    public void addZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0),
                "Deve sollevare IllegalArgumentException per divisione per zero");
    }
}
