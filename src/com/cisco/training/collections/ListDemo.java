package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.cisco.training.basics.Person;



public class ListDemo {

	public static void main(String[] args) {
		//simpleRawListOps();
		//simpleListOps();
		
		listOfUserDefinedType();
	}
	
	private static void listOfUserDefinedType() {
		List<Person> friends = new ArrayList<>();
		
		friends.add(new Person("a"));
		friends.add(new Person("b"));
		friends.add(new Person("c"));
		friends.add(new Person("d"));
		friends.add(new Person("e"));
		
		System.out.println(friends);
		
		for(Person p : friends) {
			p.name = p.name+" mod";
		}
		
		System.out.println(friends);
		
		System.out.println("______________ Trying to modify the list __________");
		
//		for(Person p : friends) {
//			
//			if(p.name.startsWith("c")) {
//				friends.remove(p);
//			}
//			if(p.name.startsWith("b")) {
//				friends.add(new Person(p.name+" new"));
//			}
//		}
		
		Iterator<Person> it = friends.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			if(p.name.startsWith("c")) {
				it.remove();
			}
		}
		
		System.out.println(friends);
	}

	private static void someAlgo(List<String> list) {
		int n = 2;
		
		String aVal = list.get(n);
		
		//other ops
		
		list.add(0, "new val");
		
		//other ops
		
		list.remove(0);
		
		//other ops
		
		
	}
	
	
	private static void simpleListOps() {
		//List<String> l = new ArrayList<>();
		
		List<String> l = new LinkedList<>();
		
		l.add("hello");
		l.add("from");
		l.add("side");
		l.add(2, "the other");
		
		l.add("123");
		
		String aVal = l.get(4);
		
		System.out.println(l.size());
		System.out.println(aVal);
		
		//don't loop like this
//		for(int i = 0; i < l.size(); i++) {
//			System.out.print(l.get(i)+" ");
//		}
		
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
			String aVal2 = it.next();
			System.out.print(aVal2+" ");
		}
		
		
		//easier way to use iterator
		
		for(String aVal3 : l) {
			System.out.print(aVal3+" ");
		}
	}

	private static void simpleRawListOps() {
		List l = new ArrayList();
		
		l.add("hello");
		l.add("from");
		l.add("side");
		l.add(2, "the other");
		
		l.add("123");
		
		String aVal = (String) l.get(4);
		
		System.out.println(l.size());
		System.out.println(aVal);
		
		for(int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}
		
	}

}
