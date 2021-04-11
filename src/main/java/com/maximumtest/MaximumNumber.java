package com.maximumtest;

/* @Description- Three integer to find the maximum using compareTo method
/* @Description- Three float to find the maximum using compareTo method
/* @Description- Three string to find the maximum using compareTo method
/* @Description- using max method to find more than one parameter
 */
public class MaximumNumber<K extends Comparable<K>> {

    private final K p;
    private final K q;
    private final K r;
    private final K s;
    private final K t;

    public MaximumNumber(K p, K q, K r, K s, K t) {
        this.p = p;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }

    public K findMaximum() {
        return MaximumNumber.findMaximum(p, q, r, s, t);
    }

    //Single generic method to compare different types of data
    public static <K extends Comparable> K findMaximum(K p, K q, K r, K s,K t) {
        K max = p;
        if (q.compareTo(max) > 0) {
            max = q;
        }
        if (r.compareTo(max) > 0) {
            max = r;
        }
        if (s.compareTo(max) > 0) {
            max = s;
        }
        if (t.compareTo(max) > 0) {
            max = t;
        }
        return max;
    }
}
