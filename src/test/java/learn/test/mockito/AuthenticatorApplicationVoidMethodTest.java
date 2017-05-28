package learn.test.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import learn.test.mockito.voidmethod.NotAuthenticatedException;

public class AuthenticatorApplicationVoidMethodTest {
	AuthenticatorInterface authenticatorMock;
	AuthenticatorApplication authenticator;
	String username = "JavaCodeGeeks";
	String password = "wrong password";

	@Before
	public void before() {

		authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
		authenticator = new AuthenticatorApplication(authenticatorMock);
	}

	@Test(expected = NotAuthenticatedException.class)
	public void test() throws EmptyCredentialsException {

		doThrow(new NotAuthenticatedException()).when(authenticatorMock).authenticateUser(username, password);
		authenticator.authenticate(username, password);
	}

}
