package com.cisco.training.optionals;

import java.util.Optional;

public class HRApp {

	public static void main(String[] args) {
		int idFromUi = 1;
//		Optional<Employee> opt = EmpDBHelper.findFromDB(idFromUi);
//
//		if (opt.isPresent()) {
//			Employee e = opt.get(); 
//			System.out.println("Id : " + e.id);
//			System.out.println("Name : " + e.name);
//		}

		
		Employee defEmp = new Employee(0, "not found");
		
		Employee e = EmpDBHelper.findFromDB(idFromUi).orElse(defEmp);
		
		System.out.println("Id : " + e.id);
		System.out.println("Name : " + e.name);
	}

}
