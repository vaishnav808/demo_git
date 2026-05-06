package org.example;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.add(5,5));
    }

    @Nested
    public class SubTest{
        @Test
        public void subTest(){
            Calculator calculator = new Calculator();
            assertEquals(0,calculator.sub(5,5));
        }

        @RepeatedTest(2)
        public void subTest2(){
            Calculator calculator = new Calculator();
            assertEquals(0,calculator.sub(5,5));
        }
    }
}
