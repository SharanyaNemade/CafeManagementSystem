package com.cafe.model;

public class CafeItem
{
	private String name;
	private double price;
	private double rating;
	private boolean is_available = false ;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}	
	public boolean isIs_available() {
		return is_available;
	}
	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	}
	
	
	
	public CafeItem(String name, double price, double rating, boolean is_available) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.is_available = is_available;
	}
	
	
	
	public CafeItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
