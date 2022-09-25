package com.example.manas.LiveEmaple.employeeJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/Employee/Address")
public class AddressController {
	
	@Autowired
	 private AddressService addressService;
	
	@Autowired
	private JPARepository jpaRepo;
			
	@GetMapping(path="/getAddress")
	public ResponseEntity<Object> getAddress(){
		return addressService.getAddress();
	}
	
	@PostMapping(path="/createAddress/{id}")
	public ResponseEntity<Object> createAddress(@PathVariable Integer id,@RequestBody EmployeeAddress empadd){
		
		EmployeeJPA empJpa = jpaRepo.getById(id);
		empadd.setEmpJPA(empJpa);
		
		return addressService.addAddress(empadd);
	}
}
