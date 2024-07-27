package com.tnsif.daythree;

public class Customer {
	private String CustomerName;
	private int CustomerId;
	private String CustomerCity;
	
	public Customer() {
		System.out.println("Default Constructor");
		}
	public Customer (String CustomerName,int CustomerId,String CustomerCity) {
		this();
		System.out.println("Parametraized Constructor");
		this.CustomerName=CustomerName;
		this.CustomerId=CustomerId;
		this.CustomerCity=CustomerCity;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String CustomerName) {
		this.CustomerName = CustomerName;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int CustomerId) {
		this.CustomerId=CustomerId;
	}
	public String getCustomerCity(String CustomerCity) {
		this.CustomerCity = CustomerCity;
	}
	@override
	public String toString() {
		return"Customer[CustomerName="+CustomerName+",CustomerId="+CustomerId+",CustomerCity="+CustomerCity+"]"
				}
}
	
	
	
	
}
