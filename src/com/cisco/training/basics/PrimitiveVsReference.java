package com.cisco.training.basics;

public class PrimitiveVsReference {

	public static void main(String[] args) {
		
		//primitives
		int answer = 42;
		
		char c = 'a';
		
		//references
		StringBuffer sb = new StringBuffer();
		
		int[] nums = new int[10];
		
		
		//call by value vs call by ref
		incrementVal(answer);
		System.out.println(answer);
		
		nums[0] = 42;
		incrementArr(nums);
		System.out.println(nums[0]);
	}
	
	public static void incrementVal(int x) {
		x++;
	}
	
	public static void incrementArr(int[] iArr) {
		iArr[0]++;
	}

}
