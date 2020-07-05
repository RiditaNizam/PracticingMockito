import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class InjectMock {

	// Passed to this list
	@Mock
	List<String> mockList;

	// Creating the mock object and then passing to the mockList
	// Will transfer all the properties to the mockList
	@InjectMocks
	Employee mockEmployee;

	@Test
	public void test_EmployeeMock() {
		MockitoAnnotations.initMocks(this);

		when(mockList.get(0)).thenReturn("Ridita");
		when(mockList.size()).thenReturn(1);

		assertEquals("Ridita", mockList.get(0));
		assertEquals(1, mockList.size());
		assertEquals("Ridita", mockEmployee.getEmployeeName().get(0));
		assertEquals(1, mockEmployee.getEmployeeName().size());

	}

}