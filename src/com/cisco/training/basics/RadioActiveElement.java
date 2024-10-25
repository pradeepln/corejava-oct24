package com.cisco.training.basics;

public class RadioActiveElement extends ChemicalElement{
	
	int halfLife;

	public RadioActiveElement(int atomicNumber, String name, String symbol,int halfLife) {
		super(atomicNumber,name,symbol);
		this.halfLife = halfLife;
	}
}
