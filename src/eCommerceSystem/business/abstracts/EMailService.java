package eCommerceSystem.business.abstracts;



import java.util.List;

import eCommerceSystem.entites.concretes.Customer;

public interface EMailService {
	 boolean isItCorrectEMail(Customer customer, List<Customer> allCustomers);
	boolean hasItBeenUsed(Customer customer, List<Customer> allCustomers);
}
