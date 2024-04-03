package com.learning.core.day2session3;

public  class Tablet implements Medicalinfo {
	
	private final String meds;
	
	public Tablet(String meds) {
		this.meds = meds;
	}

	public String getMeds() {
		return meds;
	}

	


	@Override
	//public void displayLabel() {
		// TODO Auto-generated method stub
		//System.out.println("Store tablets in cool and dry place");
		
//	}

	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Store tablets in cool and dry place");
		
	}
		
}


