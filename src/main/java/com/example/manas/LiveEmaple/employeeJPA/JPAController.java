package com.example.manas.LiveEmaple.employeeJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Employee")
public class JPAController {
	
	@Autowired
	private JPAService jpaService;
	
	@GetMapping(path="/getAll")
	public ResponseEntity<Object> getAll(){
		
		return jpaService.getAllEmployee();
	}
	
	@PostMapping(path="/create")
	public ResponseEntity<Object> createEmployee(@RequestBody EmployeeJPA empJPA){
		
		return jpaService.createEmployee(empJPA);
		
	}
		
}
