package com.example.manas.LiveEmaple.employeeJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class JPAServiceImplementation implements JPAService{
	
	@Autowired
	private JPARepository jpaRepository;

	/* Method to get all employees */
	public ResponseEntity<Object> getAllEmployee() {
		try {
			return new ResponseEntity(jpaRepository.findAll(),HttpStatus.ACCEPTED);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity("No user Avilable",HttpStatus.BAD_REQUEST);
	}

	/*create new employee*/
	public ResponseEntity<Object> createEmployee(EmployeeJPA empJPA) {
		
		jpaRepository.save(empJPA);
		return new ResponseEntity("User created",HttpStatus.CREATED);
	}

}
