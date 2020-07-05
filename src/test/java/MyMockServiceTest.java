import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MyMockServiceTest {

	@Test
	void test_Mock() {
		// Create mocked object with help of that class
		MyServiceProvider mockObj = Mockito.mock(MyServiceProvider.class);
		// When you are calling the add method, you add 30+40, you get 70
		Mockito.when(mockObj.add(30, 40)).thenReturn(70);
		// You expect 70
		assertEquals(70, mockObj.add(30, 40));
	}

}
