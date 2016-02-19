import static org.junit.Assert.*;

import org.junit.Test;

public class findDuplictesJTest {

	@Test
	public void test() {
		Assignment3 duplictes=new Assignment3();
		int[] arr={3,9,1,4,6,6};
		assertTrue(duplictes.findDuplicates(arr));
		
		int[] arr2={3,9,1,4,6};
		assertFalse(duplictes.findDuplicates(arr2));
	}

}
