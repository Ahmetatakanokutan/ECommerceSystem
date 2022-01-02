package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.LogInService;
import eCommerceSystem.dataAccess.abstracts.PersonDao;

public class LogInManager implements LogInService{

	PersonDao personDao;
	@Override
	public void logIn(String eMail, String password) {
		if(eMail != null &&password != null) {
		personDao.logIn(eMail, password);
		}
		else {
			System.out.println(eMail + " cannot login to system");
		}
	}

}
