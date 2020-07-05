import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class MockAnnotationConcept {

	@Mock
	List<String> mockList;

	@Test
	public void mockListTest() {
		MockitoAnnotations.initMocks(this);
		// When call this particular mockList, look for 0th index, then return "Ridita"
		when(mockList.get(0)).thenReturn("Ridita");
		assertEquals("Ridita", mockList.get(0));
	}

}
