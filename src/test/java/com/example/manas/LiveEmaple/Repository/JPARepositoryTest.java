package com.example.manas.LiveEmaple.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.manas.LiveEmaple.employeeJPA.EmployeeJPA;
import com.example.manas.LiveEmaple.employeeJPA.JPARepository;

@DataJpaTest
class JPARepositoryTest {

		@Autowired
		JPARepository jpaRepo;
		
		@Test
		public void test() {
			List<EmployeeJPA> list=jpaRepo.findAll();
			assertEquals(0, list.size());
		}
	

}
