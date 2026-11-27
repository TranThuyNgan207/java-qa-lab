package com.qa.lab;

public class BuggyLab {
public int daysInMonth(int month, int year) {
	if(month == 2) {
		if(year % 4 == 0 && year % 100 != 0) {
			return 29;
		}
		return 28;
	}
	return 30;
}

public int sumToN(int n) {
	int sum = 0;
	for(int i = 0; i <= n; i++) {
		sum+=i;
	}
	return sum;
}

public String getItem(String[] items, int index) {
	if(items == null) {
		throw new IllegalArgumentException("Mang khong duoc null");
	}
	if (index < 0 || index >= items.length) {
		throw new IllegalArgumentException("Index ngoai pham vi");
	}
	return items[index];
}

}
