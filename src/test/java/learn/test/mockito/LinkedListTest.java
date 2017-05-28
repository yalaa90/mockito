package learn.test.mockito;

import static org.junit.Assert.fail;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class LinkedListTest {
	LinkedList linkedList = Mockito.mock(LinkedList.class);
	@Before
	public void before() {
		
	}

	@Test
	public void test() {

	when(linkedList.size()).thenReturn(10);
	System.out.println(linkedList.size());
	
	}

}
