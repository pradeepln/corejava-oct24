package com.cisco.training.strings;

public class HeavyDutyConcat {

	public static void main(String[] args) {
		String[] words = {"this","is","an","array","with","many","words"};
		
		String sentence = formSentence(words);
		System.out.println(sentence);
	}

	private static String formSentence(String[] words) {
//		String sentence = "";
//		
//		for(int i = 0; i < words.length; i++) {
//			sentence += words[i] + " ";
//		}
//		
//		return sentence;
		
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i < words.length; i++) {
			buffer.append(words[i]);
			buffer.append(" ");
		}
		
		return buffer.toString();
	}

}
