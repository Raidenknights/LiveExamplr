package com.example.manas.LiveEmaple.employeeJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImplementation implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public ResponseEntity<Object> getAddress() {
		
		return new ResponseEntity(addressRepository.findAll(), HttpStatus.ACCEPTED);
	}

	
	public ResponseEntity<Object> addAddress(EmployeeAddress empadd) {
		// TODO Auto-generated method stub
		return new ResponseEntity(addressRepository.save(empadd),HttpStatus.CREATED);
	}

}
