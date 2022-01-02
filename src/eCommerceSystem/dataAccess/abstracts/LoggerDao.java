package eCommerceSystem.dataAccess.abstracts;

import eCommerceSystem.entites.concretes.Customer;

public interface LoggerDao {

	void log(Customer customer);
}
