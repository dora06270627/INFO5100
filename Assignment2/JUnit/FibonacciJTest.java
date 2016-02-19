import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciJTest {

	@Test
	public void test() {
		Assignment2 fib=new Assignment2();
		int[] result = fib.fibonacciNumber(7);
		int[] expectresult = { 1, 1, 2, 3, 5, 8, 13};
		assertArrayEquals(expectresult,result);
	}

}
