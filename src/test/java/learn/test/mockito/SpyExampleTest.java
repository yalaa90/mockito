package learn.test.mockito;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class SpyExampleTest {

	@Test
	public void test() {
		Map<String, String> hashMap = new HashMap<String, String>();
		Map<String, String> hashMapSpy= spy(hashMap);
	}

}
