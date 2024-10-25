package com.cisco.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		ChemicalElement ga = new ChemicalElement(31, "Gallium", "Ga");

		
		
		showDetails(h);
		showDetails(k);
		showDetails(ga);
		
		System.out.println(" h == o ? "+( h == o));
		System.out.println(" h.equals(o) ? "+( h.equals(o)));
		
		ChemicalElement h2 = new ChemicalElement(1, "hydrogen", "H");
		
		System.out.println(" h == h2 ? "+( h == h2));
		System.out.println(" h.equals(h2) ? "+( h.equals(h2)));
	}

	private static void showDetails(ChemicalElement c) {
		//c.atomicNumber = -1;
		System.out.println("____________________");
		System.out.println("name: "+c.getName()+" , symbol: "+c.getSymbol());
		System.out.println("metal? "+c.isMetal()+" , alkali? "+c.isAlkaliMetal()+" , transitionMetal? "+c.isTransitionMetal());
		System.out.println("____________________");
	}

}
