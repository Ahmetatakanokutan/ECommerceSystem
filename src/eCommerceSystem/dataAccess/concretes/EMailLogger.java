package eCommerceSystem.dataAccess.concretes;

import eCommerceSystem.dataAccess.abstracts.LoggerDao;
import eCommerceSystem.entites.concretes.Customer;

public class EMailLogger implements LoggerDao{

	@Override
	public void log(Customer customer) {
		System.out.println(customer.getName() + " named user logged via email");
		
	}

	
}
