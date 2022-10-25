package com.example.manas.LiveEmaple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.manas.LiveEmaple.WeatherAPI.WeatherService;
import com.example.manas.LiveEmaple.WeatherAPI.WeatherServiceImpl;
import com.example.manas.LiveEmaple.basic.Hello;
import com.example.manas.LiveEmaple.basic.SomeBusiness;

@ExtendWith(MockitoExtension.class)
class ListTest {
	
	@InjectMocks
	Hello hl ;
	@InjectMocks
	WeatherServiceImpl impl;
	
	@Mock
	List list;
	@Mock
	SomeBusiness smb;
	@Mock
	WeatherService weatherService;

	@Test
	public void list_basic() {
		when(list.size()).thenReturn(5);
		assertEquals(5,list.size());
	}
	
	@Test
	public void getList_Test() {
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		when(smb.retrieveList()).thenReturn(ls);
		assertEquals(ls,smb.retrieveList());
		/*when(ls.get(0)).thenReturn(1);
		assertEquals(1,ls.get(0));*/
		when(list.get(anyInt())).thenReturn("CitiBank"); /*here we are using anyInt() but there is anyString(),
		 anyShort() for the other  Datatypes*/
		assertEquals("CitiBank",list.get(0));
		assertEquals("CitiBank",list.get(1));
	}


}
