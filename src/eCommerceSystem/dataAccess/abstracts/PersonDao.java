package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entites.concretes.Customer;

public interface PersonDao {

	void add(Customer customer, List<Customer> allCustomers);
	void delete(Customer customer);
	List<Customer> showAll();
	void logIn(String eMail, String password);
	
}
