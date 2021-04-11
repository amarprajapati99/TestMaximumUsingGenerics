package com.maximumtest;

/* @Description- Three integer to find the maximum using compareTo method
/* @Description- Three float to find the maximum using compareTo method
/* @Description- Three string to find the maximum using compareTo method
/* @Description- using max method to find more than one parameter
 */
public class MaximumNumber<K extends Comparable<K>> {

    private final K x;
    private final K z;
    private final K y;

    public MaximumNumber(K x, K y, K z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public K findMaximum() {
        return MaximumNumber.findMaximum(x, y, z);
    }

    //Single generic method to compare different types of data
    public static <K extends Comparable> K findMaximum(K x, K y, K z) {
        K max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
