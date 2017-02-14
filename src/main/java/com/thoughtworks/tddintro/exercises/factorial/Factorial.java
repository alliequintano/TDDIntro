package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        for (int j = 1, jj = i; j < jj; j++) {
            i *= j;
        }
        return Math.max(1,i);
    }
}
