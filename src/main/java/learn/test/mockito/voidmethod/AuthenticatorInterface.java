package learn.test.mockito.voidmethod;

public interface AuthenticatorInterface {

	void foo();
	boolean authenticateUser(String userName, String password) throws NotAuthenticatedException;
}
