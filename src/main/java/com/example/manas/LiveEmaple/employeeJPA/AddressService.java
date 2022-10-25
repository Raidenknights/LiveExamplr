package com.example.manas.LiveEmaple.employeeJPA;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {
	public ResponseEntity<Object> getAddress();
	public ResponseEntity<Object> addAddress(EmployeeAddress empadd);
}
