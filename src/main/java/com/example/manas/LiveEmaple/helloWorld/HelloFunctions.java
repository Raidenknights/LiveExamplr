package com.example.manas.LiveEmaple.helloWorld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
@Component
public class HelloFunctions {
	private static  ArrayList<HelloBean> hello = new ArrayList<>();
	private static int count =3;
	static {
		hello.add(new HelloBean(1,"i am good",123));
		hello.add(new HelloBean(2,"i am bad",124));
		hello.add(new HelloBean(3,"I am normal",125));
	}
	public List<HelloBean> getAllHello(){
		return hello;
	}
	public ResponseEntity<Object> setUser(HelloBean user) {
		user.setId(++count);
		hello.add(user);
		
		return new ResponseEntity(HttpStatus.CREATED);
	}
	public HelloBean deleteUser(int id) {
		Iterator<HelloBean> itr = hello.iterator();
		while(itr.hasNext()) {
			HelloBean hlb = itr.next();
			if(hlb.getAmount()==id) {
				itr.remove();
			}
		}
		return null;
	}
	public HelloBean updateUser(HelloBean user,int id) {
		Iterator<HelloBean> itr = hello.iterator();
		while(itr.hasNext()) {
			HelloBean hlb = itr.next();
			if(hlb.getId()==id) {
				hlb.setMessage(user.getMessage());
				hlb.setAmount(user.getAmount());
				return hlb;
			}
		}
		return null;
	}
	public HelloBean findById(int id) {
		Iterator<HelloBean> itr = hello.iterator();
		while(itr.hasNext()) {
			HelloBean hlb = itr.next();
			if(hlb.getId()==id) {
				return hlb;
			}
		}
		return null;
	}
}