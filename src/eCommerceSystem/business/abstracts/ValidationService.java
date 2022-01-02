package eCommerceSystem.business.abstracts;



import eCommerceSystem.entites.concretes.Customer;

public interface ValidationService {
	boolean isPasswordIsGood(Customer customer);
	boolean isNameSurNameIsGood(Customer customer);
	boolean isItVerified(boolean verificationLink);
}
