package com.maximumtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    private static  MaximumNumber maximumTest = new MaximumNumber();


    @Test
    public void whenGivenThreeNumbers_AndFirstNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 2, 1};
        Integer result = maximumTest.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(3), result);
    }

    @Test
    public void whenGivenThreeNumbers_AndSecondNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 5, 1};
        Integer result = maximumTest.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(5), result);
    }

    @Test
    public void whenGivenThreeNumbers_AndThirdNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 1, 7};
        Integer result = maximumTest.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(7), result);
    }
    @Test
    public void whenGivenThreeDoubleNumbers_AndFirstNumberIsMax_ShouldReturn_true() {
        Double [] doulbeArray = {5.8, 1.2, 3.4};
        Double result = maximumTest.findMaximum(doulbeArray);
        Assertions.assertEquals(Double.valueOf(5.8), result);
    }

    @Test
    public void whenGivenThreeDoubleNumbers_AndSecondNumberIsMax_ShouldReturn_true() {
        Double [] doulbeArray = {5.2, 8.9, 2.1};
        Double result = maximumTest.findMaximum(doulbeArray);
        Assertions.assertEquals(Double.valueOf(8.9), result);
    }


    @Test
    public void whenGivenThreeDoubleNumbers_AndThirdNumberIsMax_ShouldReturn_true() {
        Double [] doulbeArray = {5.9, 2.1, 7.6};
        Double result = maximumTest.findMaximum(doulbeArray);
        Assertions.assertEquals(Double.valueOf(7.6), result);
    }
    @Test
    public void whenGivenThreeStrings_AndFirstStringIsMax_ShouldReturn_true() {
        String [] stringArray = {"Banana", "Apple", "Peach"};
        String result = maximumTest.findMaximum(stringArray);
        Assertions.assertEquals("Banana",result);
    }

    @Test
    public void whenGivenThreeStrings_AndSecondStringIsMax_ShouldReturn_true() {
        String [] stringArray = {"Peach", "apple", "Banana"};
        String result = maximumTest.findMaximum(stringArray);
        Assertions.assertEquals("apple",result);
    }


    @Test
    public void whenGivenThreeStrings_AndThirdStringIsMax_ShouldReturn_true() {
        String [] stringArray = {"Banana", "Apple", "Peach"};
        String result = maximumTest.findMaximum(stringArray);
        Assertions.assertEquals("Peach",result);
    }
}
