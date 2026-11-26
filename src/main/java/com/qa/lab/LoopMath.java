package com.qa.lab;

public class LoopMath {

    public int sumToN(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n khong duoc am: " + n);
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
        	sum+=i;
        }
        return sum;
    }
}