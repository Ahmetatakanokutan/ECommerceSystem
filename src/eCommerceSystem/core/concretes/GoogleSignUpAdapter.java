package eCommerceSystem.core.concretes;

import eCommerceSystem.GoogleService;
import eCommerceSystem.core.abstracts.SignUpService;

public class GoogleSignUpAdapter implements SignUpService{

	GoogleService googleService = new GoogleService();
	@Override
	public void signUpManager() {
		googleService.signUp();
		
	}

}
