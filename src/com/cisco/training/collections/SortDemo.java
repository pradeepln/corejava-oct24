package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cisco.training.basics.ChemicalElement;

public class SortDemo {

	public static void main(String[] args) {
		//simpleArraySort();
		//simpleListSort();
		//sortUserDefined();
		//sortStringsOnLength();
		sortStringsOnLengthUsingAnon();
	}

	private static void sortStringsOnLengthUsingAnon() {
		String[] words = {"this","is","an","array","with","many","dramatic","words","like","absynth","zebra","xylophone"};
		System.out.println(Arrays.toString(words));
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		System.out.println(Arrays.toString(words));
	}
	
	private static void sortStringsOnLength() {
		String[] words = {"this","is","an","array","with","many","dramatic","words","like","absynth","zebra","xylophone"};
		System.out.println(Arrays.toString(words));
		Arrays.sort(words, new StringLengthComparator());
		System.out.println(Arrays.toString(words));
	}

	private static void sortUserDefined() {
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		ChemicalElement ga = new ChemicalElement(31, "Gallium", "Ga");
		
		List<ChemicalElement> cList = new ArrayList<>(List.of(o, h, ga, k));
		System.out.println(cList);
		
		Collections.sort(cList);
		
		System.out.println(cList);
		
	}

	private static void simpleListSort() {
		String[] words = {"this","is","an","array","with","many","dramatic","words","like","absynth","zebra","xylophone"};
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		Collections.sort(wordList);
		System.out.println(wordList);
	}

	private static void simpleArraySort() {
		String[] words = {"this","is","an","array","with","many","dramatic","words","like","absynth","zebra","xylophone"};
		System.out.println(Arrays.toString(words));
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
	}

}
