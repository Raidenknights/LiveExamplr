package com.example.manas.LiveEmaple.basic;

import java.util.List;

public class Hello {
	
	SomeBusiness someBusiness;
	
	public void setSomeBusiness(SomeBusiness someBusiness) {
		this.someBusiness = someBusiness;
	}

	public int AddValue() {
		int sum=0;
		int[] v = someBusiness.retrieveAll();
		for(int m:v) {
			sum+=m;
		}
		return sum;
	}
	
	public String getString() {
		
		return "Super hero";
	}
	
	public String getLowecase() {
		return someBusiness.retrieveString().toLowerCase();
	}
	
	public List<Integer> getList(){
		return someBusiness.retrieveList();
	}
}
