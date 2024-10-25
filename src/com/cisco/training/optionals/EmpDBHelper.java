package com.cisco.training.optionals;

import java.util.Optional;

public class EmpDBHelper {
	
	public static Optional<Employee> findFromDB(int empId) {
		boolean found = false;
		//select * from employee where emp_id=empId
		if(found) {
			return Optional.of(new Employee(empId, "someValFromDB"));
		}else {
			return Optional.empty();
		}
		
	}

}
