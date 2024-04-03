package com.learning.core.day2session2;

public class Book {
	
	private String name;
	
	private float price;
	
	public Book(String name,float d) {
		
		this.name = name;
		this.price = d;
	}
	
	//public Book(String name, double price) {
		
	
	String getBookDetails() {
		return "BookDetails: Name:" + name 
				+ ", Price:"+ price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
