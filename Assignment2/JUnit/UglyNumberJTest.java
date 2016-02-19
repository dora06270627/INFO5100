import static org.junit.Assert.*;

import org.junit.Test;

public class UglyNumberJTest {

	@Test
	public void test() {
		Assignment2 ugly=new Assignment2();
		assertFalse(ugly.isUgly(14));
		assertTrue(ugly.isUgly(4));
	}

}
