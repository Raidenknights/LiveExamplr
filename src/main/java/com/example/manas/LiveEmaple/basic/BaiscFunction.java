package com.example.manas.LiveEmaple.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.manas.LiveEmaple.helloWorld.HelloBean;


@Component
public class BaiscFunction {
	
	int userIdCount=3;
	private static  ArrayList<BasicModel> hello = new ArrayList<>();
	static {
		hello.add(new BasicModel(1,"I am from basic ",1234));
		hello.add(new BasicModel(2,"I am new member",12345));
		hello.add(new BasicModel(3,"I am new member",12346));
	}
	public List<BasicModel> getAll(){
		return hello;
	}
	public ResponseEntity<HttpStatus> setUser(BasicModel user) {
		user.setId(++userIdCount);
		hello.add(user);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	public BasicModel getUserById(int id){
		
		Iterator<BasicModel> itr = hello.iterator();
		while(itr.hasNext()) {
			BasicModel blb = itr.next();
			if(blb.getId()==id ) {
				return blb;
			}
		}
		return null;
	}
	public void deleteUser(int id) {
		Iterator<BasicModel> itr = hello.iterator();
		while(itr.hasNext()) {
			BasicModel blb = itr.next();
			if(blb.getId()==id) {
				itr.remove();
			}
		}
	}
	public void UpdateUser(int id,BasicModel user) {
		Iterator<BasicModel> itr = hello.iterator();
		while(itr.hasNext()) {
			BasicModel blb = itr.next();
			if(blb.getId()==id) {
				blb.setAmount(user.getAmount());
				blb.setName(user.getName());
			}
		}
	}
	public int Addvalue(int v) {
		int sum=0;
		sum+=v;
		return sum;
	}
}
