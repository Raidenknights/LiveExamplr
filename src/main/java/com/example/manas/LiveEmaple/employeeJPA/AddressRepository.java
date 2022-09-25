package com.example.manas.LiveEmaple.employeeJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends  JpaRepository<EmployeeAddress, Integer>{
		
		
}
