package com.example.manas.LiveEmaple.basic;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@Autowired
	private BaiscFunction basic;
	
	
	@GetMapping(path="/basic")	
	public  String getBasic() {
			return "Hello world";
		}
	@GetMapping(path="/model")
	public static String giveBasic() {
		
		BasicModel bsm = new BasicModel(1,"I am new",1234);
		
		return bsm.getName();
	}
	
	@GetMapping(path="/getAll")
	public static BasicModel getAll() {
		
		return new BasicModel(2,"I am from get all",1234);
	}
	
	
	@GetMapping(path="/getAllBasic")
	public  List<BasicModel> getAllBasic(){
		
		return basic.getAll();
	}
	
	/*@PostMapping(path="/createBasic")
	public  ResponseEntity<Object> createUser(@Valid @RequestBody BasicModel user) {
		return  basic.setUser(user);
}*/
	@GetMapping(path="/findUser/{id}")
	public ResponseEntity<Object> findUser(@PathVariable int id){
		BasicModel fUser=basic.getUserById(id);
		if(fUser==null) {
			throw new BasicUserNotFoundDB("No BasicUser exists with id:"+id);
		}
		return new ResponseEntity(fUser,HttpStatus.FOUND);
	}
	@DeleteMapping(path="/deleteUser/{id}")
	public void deleteUserById(@PathVariable int id) {
		basic.deleteUser(id);
	}
	@PutMapping(path="/updateUser/{id}")
	public void updateUserById(@PathVariable int id, @RequestBody BasicModel user) {
		basic.UpdateUser(id, user);
	}
	
	
}
