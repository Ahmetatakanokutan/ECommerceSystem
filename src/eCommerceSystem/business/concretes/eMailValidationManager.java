package eCommerceSystem.business.concretes;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSystem.business.abstracts.EMailService;
import eCommerceSystem.entites.concretes.Customer;

public class eMailValidationManager implements EMailService{
	
	
	
	public boolean isItCorrectEMail(Customer customer, List<Customer> allCustomers) {
		Pattern pattern = Pattern.compile("@");
		Matcher matcher = pattern.matcher(customer.geteMail());
		if(matcher.find() == true) {
			
			System.out.println(customer.geteMail() + " e mail format is valid");
			
			return hasItBeenUsed(customer, allCustomers);
		}
		if(matcher.find() == false) {
			System.out.println(customer.geteMail() + " e mail format is NOT valid");
		}
		return matcher.find();
	}
	
	public boolean hasItBeenUsed(Customer customer, List<Customer> allCustomers) {
		if(allCustomers.contains(customer) == true) {
			System.out.println(customer.geteMail() + " This e-mail has already been used");
			return false;
			
		}
		else {
		System.out.println("you can use this e mail");
		allCustomers.add(customer);
		return true;
		}
	}
}

	
