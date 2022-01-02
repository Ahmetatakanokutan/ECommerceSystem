package eCommerceSystem.dataAccess.concretes;


import java.util.List;

import eCommerceSystem.dataAccess.abstracts.PersonDao;
import eCommerceSystem.entites.concretes.Customer;

public class CustomerDao implements PersonDao{

	List<Customer> allCustomers;
	
	public void add(Customer customer, List<Customer> allCustomers) {
		allCustomers.add(customer);
		System.out.println(customer.getName() + " named user registered");
		
	}

	
	public void delete(Customer customer) {
		allCustomers.remove(customer);
		System.out.println(customer.getName() + " named user deleted from database");
	}

	
	public List<Customer> showAll() {
		return allCustomers;
	}


	@Override
	public void logIn(String eMail, String password) {
		System.out.println(eMail + " log in the system");
		
	}

}
