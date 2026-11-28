package com.qa.lab;

public class SafeArrayReader {

    public String getElementSafely(String[] items, int index) {
    	
        if (items == null) {
            throw new IllegalArgumentException("Mang khong duoc phep null!");
        }

        if (index < 0 || index >= items.length) {
            throw new IllegalArgumentException("Index " + index + " nam ngoai pham vi mang!");
        }

        return items[index];
    }
}