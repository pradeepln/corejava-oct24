package com.cisco.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamsDemo {
	
	static int counter;
	
	private synchronized int incCounter() {
		return ++counter;
	}

	static AtomicInteger counter2 = new AtomicInteger(0);
	public static void main(String[] args) {
		String[] words = {"this","is","an","array","with","many","dramatic","words","like","absynth","zebra","xylophone"};
		List<String> wordList = Arrays.asList(words);
		
		//Stream.of(words).forEach(s -> System.out.println(s));
		
		//Stream.of(words).parallel().forEach(s -> System.out.println(s));
		
		//wordList.stream().forEach(s -> System.out.println(s));
		
//		wordList
//			.stream()
//			.map(s -> s.toUpperCase())
//			.forEach(s -> System.out.println(s));
		
//		List<String> upperWords =
//		wordList
//		.stream()
//		.map(s -> s.toUpperCase())
//		.toList();
//		
//		System.out.println(upperWords);
		
//		List<Integer> lengthsSqured = wordList
//				.stream()
//				.map(s -> s.length())
//				.map(n -> n*n)
//				.toList();
//		System.out.println(lengthsSqured);
		
//		List<Integer> lengthsSquredOdd = wordList
//				.stream()
//				.map(s -> s.length())
//				.map(n -> n*n)
//				.filter(n -> n%2 != 0)
//				.toList();
//		System.out.println(lengthsSquredOdd);
		
		List<Integer> lengthsSquredOdd = wordList
				.stream()
				.map(s -> s.length())
				.map(n -> n*n)
				.filter(n -> n%2 != 0)
				.filter(n -> n < 50)
				.distinct()
				.toList();
		System.out.println(lengthsSquredOdd);
		
		
		
	}

}
