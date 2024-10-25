package com.cisco.training.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		simpleMapOps();

	}

	private static void simpleMapOps() {
		//Map<String, Integer> runsMap = new HashMap<>();
		//Map<String, Integer> runsMap = new LinkedHashMap<>();
		Map<String, Integer> runsMap = new TreeMap<>();
		
		runsMap.put("virat", 12);
		runsMap.put("rohit", 21);
		runsMap.put("pant", 31);
		runsMap.put("extras", 23);
		runsMap.put("bumrah",99);
		runsMap.put("ashwin", 101);
		
		runsMap.put("rohit", 22);
		
		System.out.println(runsMap);
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a name: ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			
			if(runsMap.containsKey(input)) {
				System.out.println(input+" has scored "+runsMap.get(input));
			}else {
				System.out.println("No Data for "+input);
			}
		}
		
		System.out.println("_______________________________________");
		Set<String> keys = runsMap.keySet();
		
		for(String aBatter : keys) {
			System.out.println(aBatter+" ------> "+runsMap.get(aBatter));
		}
		
	}

}
