package com.jahadenglish.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	//use this to populate countries instead od hard coding them in HTML
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		//Initialize hashmap
		countryOptions = new LinkedHashMap<>();
		
		//populate list
		countryOptions.put("USA", "USA");
		countryOptions.put("BZR", "Brazil");
		countryOptions.put("MEX", "Mexico");
		countryOptions.put("FRC", "France");
		countryOptions.put("ITL", "Italy");
		countryOptions.put("DE", "Germany");
		
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	
}
