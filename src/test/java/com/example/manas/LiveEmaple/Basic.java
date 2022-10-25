package com.example.manas.LiveEmaple;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.manas.LiveEmaple.basic.BaiscFunction;
import com.example.manas.LiveEmaple.basic.BasicController;
import com.example.manas.LiveEmaple.basic.BasicModel;
import com.example.manas.LiveEmaple.basic.Hello;

class Basic {
	
	private BasicController basic;
	
	@Autowired
	private BaiscFunction basicFun;
	
	public void setBasicFun(BaiscFunction basicFun) {
		this.basicFun = basicFun;
	}

	/*@Test
	public void calculateSum() {
		Hello hs = new Hello();
		int actual = hs.AddValue(5);
		int expected=5;
		assertEquals(actual,expected);
	}
	
	@Test
	public void calculateWrongSum() {
		Hello hs = new Hello();
		int actual2=hs.AddValue(10);
		int expected2=19;
		assertNotEquals(actual2,expected2);
	}*/
	

}
