package learn.test.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AuthenticatorAplicationAntTest {

	String username = "javacodegeeks";
	String password = "s4f3 p4ssw0rd";

	@Mock
	private AuthenticatorInterface authenticatorMock;

	@InjectMocks
	private AuthenticatorApplication authenticator;

	@Test
	public void test() throws EmptyCredentialsException {
		when(authenticator.authenticate(username, password)).thenReturn(true);
		assertTrue("authenticate faild", authenticator.authenticate(username, password));
	}

}
