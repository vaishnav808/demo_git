package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayListTest {

//    @EnabledOnJre(JRE.JAVA_8)
    @ParameterizedTest
    @CsvSource({
            "45,34,65,23,56"
    })
    public void sortTest(){
        List<Integer> list = Arrays.asList(45,34,65,23,56);

        List<Object> expected = Arrays.asList(23,34,45,56,65);

        List<Integer> reuslt = ArrayListDemo.sort(list);

        assertArrayEquals(expected.toArray(), reuslt.toArray());

    }
}
