package com.example.manas.LiveEmaple.employee;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	public List<Employee> findAll();
	public ResponseEntity<Object> addEmployee(Employee employee);
	public ResponseEntity<Object> findById(String id);
	public ResponseEntity<Object> updateEmployee(Employee employee,String id);
}
