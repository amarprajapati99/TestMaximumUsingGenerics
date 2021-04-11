package com.maximumtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {

    private static MaximumNumber maximumNumber;

    @Test
    public void whenGivenThreeStrings_ShouldReturnMaximumString() {
        String str1 = "Apple", str2 = "Peach", str3 = "Banana";
        maximumNumber = new MaximumNumber(str1, str2, str3);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(str2, result);
    }

    @Test
    public void whenGivenThreeNumbers_ShouldReturnMaximumNumber() {
        Integer int1 = 12, int2 = 5, int3 = 7;
        maximumNumber = new MaximumNumber(int1, int2, int3);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(int1, result);
    }

    @Test
    public void whenGivenThreeFloatNumbers_ShouldReturnMaximumFloatNumber() {
        Float float1 = 5.7f, float2 = 3.2f, float3 = 8.1f;
        maximumNumber = new MaximumNumber(float1, float2, float3);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(float3, result);
    }
}