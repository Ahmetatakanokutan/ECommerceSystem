package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.ValidationService;
import eCommerceSystem.entites.concretes.Customer;

public class ValidationManager implements ValidationService{
	public boolean isPasswordIsGood(Customer customer) {
		if(customer.getPassword().length()<6) {
			System.out.println("this password is too short");
			return false;
	}
		else {
			System.out.println(customer.getPassword() + " password is long enough");
			return true;
		}

}

	@Override
	public boolean isNameSurNameIsGood(Customer customer) {
		if(customer.getName().length() <2) {
			System.out.println(customer.getName() + " is very short");
		}
		if(customer.getSurName().length() <2) {
			System.out.println(customer.getSurName() + " is very short");
		}
		else {
			return true;
		}
		return false;
	}

	public boolean isItVerified(boolean verificationLink) {
		if(verificationLink == true) {
			System.out.println("user verified");
			return true;
		}
		else {
			System.out.println("user cannot verified");
		return false;
		}
	}
	
	}

	
