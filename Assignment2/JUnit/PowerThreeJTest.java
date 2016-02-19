import static org.junit.Assert.*;

import org.junit.Test;

public class PowerThreeJTest {

	@Test
	public void test() {
		Assignment2 powerthree= new Assignment2();
		int[] N =powerthree.findPowerOfThree(3);
		int[] expectresult= {1,3,9};
	    assertArrayEquals(expectresult,N);
	}
}

