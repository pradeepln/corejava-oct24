package com.cisco.training.basics;

public class FinalDemo {

	public static void main(String[] args) {
		final int i = 10;

		//i++;
		//i = 21;
		
		final Person p = new Person("pradeep");
		p.name = "abc";
		
		//p = new Person("aaa");
	}

}


final class Base{
	 void m1() {
		
	}
}

//class Child extends Base{
//	@Override
//	void m1() {
//		
//	}
//}