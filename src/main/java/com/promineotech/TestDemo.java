package com.promineotech;

public class TestDemo {
	public int addPositive(int a, int b) {
		int total = 0;
		if(a > 0 && b > 0) {
			total = a + b;
		} else if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Invalid Parameters");
		}
		return total;
	}
}
