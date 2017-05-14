package learn.test.mockito;

public class AuthenticatorApplication {

	private AuthenticatorInterface authenticator;

	public AuthenticatorApplication(AuthenticatorInterface authenticator) {
		this.authenticator = authenticator;
	}

	public boolean authenticate(String username, String password) throws EmptyCredentialsException {
		authenticator.foo();
		return this.authenticator.authenticateUser(username, password);
	}
}
