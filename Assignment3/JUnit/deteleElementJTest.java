import static org.junit.Assert.*;

import org.junit.Test;

public class deteleElementJTest {

	@Test
	public void test() {
		Assignment3 detele=new Assignment3();
		int[] element = {3,6,5,7,23};
		int[] result = detele.deteleElement(element, 4);
		int[] expectedresult = {3,6,5,7};
		assertArrayEquals(result,expectedresult);
	}

}
