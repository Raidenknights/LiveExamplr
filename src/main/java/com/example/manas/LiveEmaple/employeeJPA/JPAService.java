package com.example.manas.LiveEmaple.employeeJPA;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface JPAService {
		public ResponseEntity<Object> getAllEmployee();
		public ResponseEntity<Object> createEmployee(EmployeeJPA empJPA);
}
