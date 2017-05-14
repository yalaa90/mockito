package learn.test.mockito;

import static org.mockito.Mockito.inOrder;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class AuthenticatorApplicationTest {
	String username = "JavaCodeGeeks";
	String password = "unsafePassword";
	AuthenticatorInterface authenticatorMock;
	AuthenticatorApplication authenticator;
	InOrder inorder;

	@Before
	public void before() {
		authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
		inorder = inOrder(authenticatorMock);
		authenticator = new AuthenticatorApplication(authenticatorMock);
	}

	@Test
	public void test() throws EmptyCredentialsException {

		when(authenticatorMock.authenticateUser(username, password)).thenReturn(false);
		System.out.println(authenticator.authenticate(username, password));
		verify(authenticatorMock).authenticateUser(username, password);

		// order
		
		inorder.verify(authenticatorMock).foo();
		inorder.verify(authenticatorMock).authenticateUser(username, password);
	
		// timeout
		
		verify(authenticatorMock,timeout(100).times(1)).authenticateUser(username, password);
		
		
	}
	
	
	@Test(expected= EmptyCredentialsException.class)
	public void testException() throws EmptyCredentialsException {
		when(authenticatorMock.authenticateUser(username, "")).thenThrow(new EmptyCredentialsException());
	
		authenticator.authenticate("", "");
	}

}
