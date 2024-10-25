package com.cisco.training.basics;

public class Person {
	
	public String name;
	Person spouce;
	
	public Person(String name) {
		this.name = name;
//		this.spouce = new Person("abc");
	}
	
	public void setSpouce(String name) {
		Person s = new Person(name);
		this.spouce = s;
	}
	
	
	public static void main(String[] args) {
		Person p = new Person("pradeep");
		p.setSpouce("abc");
//		Person abc = new Person("abc");
//		abc.spouce = p;
//		p.spouce = abc;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", spouce=" + spouce + "]";
	}

	
	
}
