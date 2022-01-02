package eCommerceSystem.business.abstracts;

import java.util.List;


import eCommerceSystem.entites.concretes.Customer;

public interface PersonService {
	void add(Customer customer);
	void delete(Customer customer);
	void showAll(List<Customer> customer);
	
	
	
	
}
