package com.cisco.training.strings;

import com.cisco.training.basics.ChemicalElement;

public class ObjectAsString {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1, "hydrogen", "H");
		
		String result = "hello " + h; //"hello " + h.toString();
		
		System.out.println(result);
		
		System.out.println("The obj is : "+h);
		
		System.out.println(h);

	}

}
