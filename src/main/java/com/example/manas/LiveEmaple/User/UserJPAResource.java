/*package com.example.manas.LiveEmaple.User;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserJPAResource {
	
	@Autowired
	private UserRepository userRepo;

	@GetMapping(path="/Jpa/getAll")
	public List<UserModel> geJPAAll() {
		return userRepo.findAll();
	}
	
	@PostMapping(path="/Jpa/createUser")
	public HttpStatus createJpaUser(@Valid @RequestBody UserModel user) {
		userRepo.save(user);
		return HttpStatus.CREATED;
	}
}*/
