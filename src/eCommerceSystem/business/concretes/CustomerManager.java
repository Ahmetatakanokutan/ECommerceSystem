package eCommerceSystem.business.concretes;


import java.util.List;
import eCommerceSystem.business.abstracts.EMailService;
import eCommerceSystem.business.abstracts.PersonService;
import eCommerceSystem.business.abstracts.ValidationService;
import eCommerceSystem.dataAccess.abstracts.LoggerDao;
import eCommerceSystem.dataAccess.abstracts.PersonDao;
import eCommerceSystem.entites.concretes.Customer;

public class CustomerManager implements PersonService{

	ValidationService validationService;
	EMailService eMailService;
	PersonDao personDao;
	LoggerDao loggerDao;
	List<Customer> allCustomers;
	boolean verificationLink;

	public CustomerManager(ValidationService validationService, EMailService eMailService,
			PersonDao personDao, LoggerDao loggerDao, List<Customer> allCustomers, boolean verificationLink) {
		super();
		this.validationService = validationService;
		this.eMailService = eMailService;
		this.personDao = personDao;
		this.loggerDao = loggerDao;
		this.allCustomers = allCustomers;
		this.verificationLink = verificationLink;
	}

	@Override
	public void add(Customer customer) {
		
		if(eMailService.isItCorrectEMail(customer, allCustomers) == true && validationService.isPasswordIsGood(customer) == true &&
				validationService.isNameSurNameIsGood(customer) && validationService.isItVerified(verificationLink)) {
			personDao.add(customer, allCustomers);
			loggerDao.log(customer);
		}
		else {
			System.out.println(customer.getName() + " named user cannot added to system");
		}
		}
		
	

	@Override
	public void delete(Customer customer) {
		personDao.delete(customer);
		
	}

	@Override
	public void showAll(List<Customer> customer) {
		personDao.showAll();
		
	}

	
	

}
