package com.example.manas.LiveEmaple.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	static List<Employee> employee1= new ArrayList<>();
	static {
		employee1.add(new Employee("Manas","1791254", Arrays.asList("Java"),23));
	}
	
	public List<Employee> findAll(){
		return employee1;
	}
	///ADD EMPLOYEE
	public ResponseEntity<Object> addEmployee(Employee employee){
		employee1.add(employee);

		return new ResponseEntity(HttpStatus.ACCEPTED);
	}

	public ResponseEntity<Object> findById(String id){
		Iterator<Employee> itr = employee1.iterator();
		while(itr.hasNext()) {
			Employee emp= itr.next();
			if(emp.getEmployeeID().equals(id)) {
				return new ResponseEntity(emp,HttpStatus.FOUND);
			}
		}
		return new ResponseEntity("No resource found",HttpStatus.NOT_FOUND);
	}

	public ResponseEntity<Object> updateEmployee(Employee employee,String id){
		Iterator<Employee> itr = employee1.iterator();
		while(itr.hasNext()) {
			Employee emp= itr.next();
			if(emp.getEmployeeID().equals(id)) {
				emp.setAge(employee.getAge());
				emp.setEmployeeName(employee.getEmployeeName());
				emp.setAge(employee.getAge());
				return new ResponseEntity("successFully updated",HttpStatus.FOUND);
			}
		}
		return new ResponseEntity("Resource not found cant update",HttpStatus.NOT_FOUND);
	}
}
