package com.cisco.training.basics;

public class NestedLoopBreakDemo {

	public static void main(String[] args) {
		int i = 10;
		
		loop1:while(i > 0) {
			
			//logic1
			
			int j = i;
			
			while(j < 11) {
				//logic 2
				if(i % 2 == 0) {
					break loop1;
				}
				j++;
			}
			
			
			//logic 3
			i--;
		}
		
		//logic 4

	}

}
