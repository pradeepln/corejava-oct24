package com.cisco.training.basics;

public class LiteralDemo {

	public static void main(String[] args) {
		int i = 71;
		long l = 71; //implicit type cast
		float f = 71;
		double d = 71;
		
		m1(71);
		m1(71L);
		m1(71f);
		m1(71D);
		m1(71.0);
		
		int smallNum = (int) l; //explicit
	}
	
	public static void m1(int x) {
		//some logic with x
	}

	public static void m1(long x) {
		//some logic with x
	}
	
	public static void m1(float x) {
		//some logic with x
	}
	
	public static void m1(double x) {
		//some logic with x
	}
}
