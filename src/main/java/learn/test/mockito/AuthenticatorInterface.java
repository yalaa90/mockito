package learn.test.mockito;

public interface AuthenticatorInterface {

	void foo();
	boolean authenticateUser(String userName, String password) throws EmptyCredentialsException;
}
