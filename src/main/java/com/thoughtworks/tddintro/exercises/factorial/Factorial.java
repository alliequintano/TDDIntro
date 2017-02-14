package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        int k = i;
        for (int j = 1; j < k; j++) {
            i *= j;
        }
        return Math.max(1,i);
    }
}
