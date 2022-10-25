package com.example.manas.LiveEmaple.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/tcs")
public class EmployeeControlller {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(path="/employee")
	List<Employee> getAll(){
		return employeeService.findAll();
	}
	
	@PostMapping(path="/employee")
	ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
		
	return 	employeeService.addEmployee(employee);
	}
	
	@GetMapping(path="employee/{id}")
	ResponseEntity<Object> getEmployeeById(@PathVariable String id){
		
		return employeeService.findById(id);
	}
	
	@PutMapping(path="employee/update/{id}")
	ResponseEntity<Object> updateEmployee(@RequestBody Employee employee,@PathVariable String id){
		return employeeService.updateEmployee(employee, id);
	}
	
}
