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
}
