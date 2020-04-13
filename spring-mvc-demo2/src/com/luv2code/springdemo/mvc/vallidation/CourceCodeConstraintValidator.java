package com.luv2code.springdemo.mvc.vallidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourceCodeConstraintValidator implements ConstraintValidator<CourceCode,String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourceCode theCourceCode) {
		// TODO Auto-generated method stub
		coursePrefix=theCourceCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result=theCode.startsWith(coursePrefix);
		return false;
	}

}
