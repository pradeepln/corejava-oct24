package com.cisco.training.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		
		m2();
		
	}

	private static void m2() {
		
		int[] nums = {1,2};
		
		DOWFinder f = null;
		
		int divisor = 0;
		
		//m3(nums);
		//m4(f);
		//m5(divisor);
		
		try {
			m6("abc.txt");
		}catch (FileNotFoundException e) {
			System.out.println("Hey! That abc.txt turned out bad file name. Enter a proper file name:");
//			String another = new Scanner(System.in).nextLine();
//			m6(another);
		}
	}

	private static void m6(String fileName) throws FileNotFoundException {
		 
		try (FileReader reader = new FileReader(fileName);) {
			int aChar = reader.read();
			//other stuff
		}catch (FileNotFoundException e) {
			
			System.out.println(fileName+" not found... therefore refering to some other fallback file");
			//open a reader on some fallback.txt file and get data from it
		} catch (IOException e) {
			System.out.println("Io exc");
		}
		
		//FileReader reader = new FileReader(fileName);
	}

	private static void m5(int divisor) {
		int result = 25/divisor;
		
//		float f = divisor;
//		float result = 25f/f;
//		System.out.println(result);
	}

	private static void m4(DOWFinder f) {
		f.findDOW(12, 11, 1999);
		
	}

	private static void m3(int[] nums) {
		System.out.println(nums[3]);
	}

}
