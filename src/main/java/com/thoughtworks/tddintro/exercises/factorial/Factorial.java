package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        for (int j = 1, jj = i; j < jj; j++) {
            i *= j;
        }
        return Math.max(1,i);
    }
}
