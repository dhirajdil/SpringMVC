package com.luv2code.springdemo.mvc;

import java.util.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	@NotNull(message="is required")
	@Size(min=1)
	private String firstname;
	@NotNull(message="is required")
	@Size(min=1)
	private String lastname;
	@NotNull(message="is required")
	@Size(min=1)
	private String country;
	private LinkedHashMap<String,String> countryOption;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	Student(){
		countryOption=new LinkedHashMap<String, String>();
		countryOption.put("BR","Brazil");
		countryOption.put("FR","France");
		countryOption.put("DE","Germany");
		countryOption.put("IN","India");
		countryOption.put("US","Uited State of America");
	}

	public String getFirstname() {
		return firstname;
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
