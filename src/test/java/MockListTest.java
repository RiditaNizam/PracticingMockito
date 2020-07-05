import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class MockListTest {

	@Test
	void test_MockListTest() {

		// Create mock object out of this particular List
		List<String> mockList = mock(List.class);
		// Using this list, you have designed the mock, please return 5 all the time
		when(mockList.size()).thenReturn(5);
		assertEquals(5, mockList.size());
	}

}
