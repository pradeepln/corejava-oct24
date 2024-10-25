package com.cisco.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {
	
	int ins = 9;
	static int si = 17; 

//arity           ret                   arg
//s  acSp  mod    ret      name         arg
	public static int wordsWithEFirst(String s1,String s2){
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(s2.contains("e") && !s1.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String[] words = {"this","is","an","array","with","many","dramatic","words","like","absynth","zebra","xylophone"};
		System.out.println(Arrays.toString(words));
		
//		Arrays.sort(words, (String s1, String s2) -> {
//			return s1.length() - s2.length();
//		});
		
		
//		Arrays.sort(words, (s1,s2) -> {
//			return s1.length() - s2.length();
//		});
		
//		Arrays.sort(words, (s1,s2) -> s1.length() - s2.length());
		
//		Arrays.sort(words, (s1,s2) -> s2.length() - s1.length());
		
//		Arrays.sort(words, (s1,s2) -> s1.charAt(0) - s2.charAt(0));
		
//		Arrays.sort(words, (s1,s2) -> {
//			if(s1.contains("e") && !s2.contains("e")) {
//				return -1;
//			}else if(s2.contains("e") && !s1.contains("e")) {
//				return 1;
//			}else {
//				return 0;
//			}
//		});
		
//		Arrays.sort(words, (s1,s2) -> wordsWithEFirst(s1, s2));
		
//		Arrays.sort(words, LambdaDemo::wordsWithEFirst);
		
		int i = 42;
		
		
		Arrays.sort(words, (s1,s2) -> {
			if(s1.contains("e") && !s2.contains("e")) {
				//int i = 10;
				//ins = 1;
				//si = 21;
				System.out.println(i);
				return -1;
			}else if(s2.contains("e") && !s1.contains("e")) {
				return 1;
			}else {
				return 0;
			}
		});
			
		//i++;	
		
		System.out.println(Arrays.toString(words));

	}

}
