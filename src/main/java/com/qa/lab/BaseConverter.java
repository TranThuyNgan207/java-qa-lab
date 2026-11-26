package com.qa.lab;

public class BaseConverter {

    public String decimalToBinary(int n) {
        // 1. Chặn biên n = 0 để không trả về chuỗi rỗng ""
        if (n == 0) {
            return "0";
        }

        // 2. Cất dấu âm và ép sang kiểu long để chống tràn số Integer.MIN_VALUE
        boolean isNegative = (n < 0);
        long num = Math.abs((long) n);

        // 3. Vòng lặp chia 2 lấy dư và ghép chuỗi ngược từ phải sang trái
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        // 4. Kiểm tra cờ số âm để gắn dấu "-"
        if (isNegative) {
            return "-" + binary;
        } else {
            return binary;
        }
    }
}