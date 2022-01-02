package eCommerceSystem;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.business.concretes.CustomerManager;
import eCommerceSystem.business.concretes.ValidationManager;
import eCommerceSystem.business.concretes.eMailValidationManager;
import eCommerceSystem.core.abstracts.SignUpService;
import eCommerceSystem.core.concretes.GoogleSignUpAdapter;
import eCommerceSystem.dataAccess.concretes.CustomerDao;
import eCommerceSystem.dataAccess.concretes.EMailLogger;
import eCommerceSystem.entites.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		List<Customer> allCustomers = new ArrayList<Customer>();
	
		Customer customer = new Customer("atakan", "Okutan", "atakanokutan@gmail.com", "1234gdfg5");
		Customer customer2 = new Customer("atakan", "Okutan", "atakanokutan@gmail.com", "1234gdfg5");
		
		SignUpService signUpService = new GoogleSignUpAdapter();
		
		
		CustomerManager customerManager = new CustomerManager(new ValidationManager(), new eMailValidationManager(),
				new CustomerDao(), new EMailLogger(), allCustomers, true);
	
		customerManager.add(customer);
		customerManager.add(customer2);
		signUpService.signUpManager();
	}

}
