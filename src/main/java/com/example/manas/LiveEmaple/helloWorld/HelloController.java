package com.example.manas.LiveEmaple.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController  {
	
	/*@Autowired
	private HelloFunctions hlf;*/
	
	@GetMapping(path="/hello")
	public  String hello(){
		return "Hello world";
	}
	@GetMapping(path="/hellomessage")
	public static HelloBean helloMessage() {
		
		HelloBean hb = new HelloBean(2,"I am Springboot",123);
		return hb;
	}
	
	@PostMapping(path="/helloBeanCreate")
	public HelloBean getHelloMessage(@RequestBody HelloBean user) {
		
		
		return user;
	}
	/*
	@GetMapping(path="/helloClass")
	public static HelloBean helloClass() {
		
		return new HelloBean(1,"I am SpringBoot",1234);
	}
	
	//GETTING ALL CLASS METHODS
	@GetMapping(path="/AllHello")
	public  List<HelloBean> getAll(){
		return hlf.getAllHello();
	}
	@PostMapping(path="/createHello")
	public  ResponseEntity<Object> createUser(@Valid @RequestBody HelloBean hello,String userName,String password) {
		return hlf.setUser(hello);
	}
	@DeleteMapping(path="/deleteHello/{id}")
	public void deleteUser(@PathVariable int id) {
		HelloBean user = hlf.deleteUser(id);
		if(user==null) {
			throw new UserNotFound("No user found with id"+id);
		}
	}
	@PutMapping(path="/update/{id}")
	public ResponseEntity<Object> updateUser(@RequestBody HelloBean user,@PathVariable int id) {
		HelloBean updatedUser = hlf.updateUser(user, id);
		if(updatedUser==null) {
			throw new UserNotFound("No user found with id"+id);
		}
		return  new ResponseEntity(HttpStatus.OK);
	}
	@GetMapping(path="/find/{id}")
	public ResponseEntity<Object> findUser(@PathVariable int id) {
		
		HelloBean user = hlf.findById(id);
		if(user==null) {
			throw new UserNotFound("No user registered with id "+id);
		}
		
		return new ResponseEntity(user,HttpStatus.FOUND);
	}*/
}
