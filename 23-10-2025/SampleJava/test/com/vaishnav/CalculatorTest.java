package com.vaishnav;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void start() {
        System.out.println("Testing Start");
        calculator = new Calculator();
    }

    @Test
    void addTest() {
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    void subTest() {
        int result = calculator.sub(10, 2);
        assertEquals(8, result);
    }

    @AfterEach
    void end() {
        System.out.println("Testing End");
    }
}