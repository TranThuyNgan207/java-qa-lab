package com.qa.lab;

public class SafeArrayReader {

    public String getElementSafely(String[] items, int index) {
        // 1. Kiểm tra mảng null -> chủ động ném lỗi rõ ràng
        if (items == null) {
            throw new IllegalArgumentException("Mang khong duoc phep null!");
        }

        // 2. Kiểm tra biên index (nhỏ hơn 0 hoặc lớn hơn/bằng độ dài mảng)
        if (index < 0 || index >= items.length) {
            throw new IllegalArgumentException("Index " + index + " nam ngoai pham vi mang!");
        }

        // 3. Hợp lệ thì trả về phần tử
        return items[index];
    }
}