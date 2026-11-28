package com.qa.lab;

public class BaseConverter {

    public String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }

        boolean isNegative = (n < 0);
        long num = Math.abs((long) n);

        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        if (isNegative) {
            return "-" + binary;
        } else {
            return binary;
        }
    }
}