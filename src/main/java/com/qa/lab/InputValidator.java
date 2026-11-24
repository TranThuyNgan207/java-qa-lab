package com.qa.lab;
public class InputValidator{
	
	public boolean isValidAge(Integer age) {
		if(age == null) {
			return false;
			
		}
		return age >= 18 && age <= 60;
	}
}