package com.cisco.training.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		List<String> merged = mergeValues("first","second");
		//List<String> merged = mergeValues("first",123);
		System.out.println(merged);
		
		List<Integer> mergedInts = mergeValues(123, 234);
		System.out.println(mergedInts);
	}

	private static <T> List<T> mergeValues(T v1, T v2) {
		List<T> l = new ArrayList<T>();
		l.add(v1);
		l.add(v2);
		return l;
	}

}
