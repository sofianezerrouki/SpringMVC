package com.camacode.spring;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName ;
	private String country;
	
	private LinkedHashMap<String,String> countryOptions = new LinkedHashMap<String, String>();
	
	public Student() {
		//popular country option
		countryOptions.put("ALG", "Algeria");
		countryOptions.put("CA", "canada");
		countryOptions.put("US", "USA");
		countryOptions.put("IT", "ITALIA");
		countryOptions.put("NG", "Negeria");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
}
