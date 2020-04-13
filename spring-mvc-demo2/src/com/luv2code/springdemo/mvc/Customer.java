package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.mvc.vallidation.CourceCode;


@Component
public class Customer {

	@NotNull(message="is required")
	@Size(min=1)
	private String firstname;
	

	@NotNull(message="is required")
	@Size(min=1)
	private String lastname;

	@Min(value=0,message="must be equal or greater then 0")
	@Max(value=0,message="must be less then or equal to 10")
	private int freePasses;
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 chars/digits")
	private String postalCode;
	
	@CourceCode
	private String courceCode;
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourceCode() {
		return courceCode;
	}
	public void setCourceCode(String courceCode) {
		this.courceCode = courceCode;
	}
	public String getFirstname() {
		return firstname;
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
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	
	

}
