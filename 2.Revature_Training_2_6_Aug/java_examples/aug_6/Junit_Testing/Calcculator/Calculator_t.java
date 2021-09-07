package Calcculator;


public class Calculator_t {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
//	public static void main(String[] args) {
//		System.out.println(add(8,9));
//	}
	public static int addPositiveNumbers(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("Negative number not allowed");
		}
		return a + b;
	}

}
