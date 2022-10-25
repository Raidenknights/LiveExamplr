package com.example.manas.LiveEmaple.LiveUser;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiveJPAController {
	
	@Autowired
	private LiveRepository liveRepo;
	
	@GetMapping(path="/Jpa/getAll")
	public List<LiveUser> geJPAAll() {
		return liveRepo.findAll();
	}
	@PostMapping(path="Jpa/createLive")
	public HttpStatus createLiveUser(@Valid @RequestBody LiveUser user) {
		liveRepo.save(user);
		return HttpStatus.CREATED;
	}
	/*@GetMapping(path="/jpa/findById/{id}")
	public ResponseEntity<Object> findbyid(@PathVariable int id,@PathVariable String name){
		
		return new ResponseEntity(liveRepo.findById(id,name),HttpStatus.FOUND);
	}*/
}
