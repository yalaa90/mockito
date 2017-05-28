package learn.test.mockito.voidmethod;

public class AuthenticatorApplication {

	private AuthenticatorInterface authenticator;

	public AuthenticatorApplication(AuthenticatorInterface authenticator) {
		this.authenticator = authenticator;
	}

	public void authenticate(String username, String password) throws NotAuthenticatedException {
		authenticator.foo();
		 this.authenticator.authenticateUser(username, password);
	}
}
