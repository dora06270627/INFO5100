import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberJTest {

	@Test
	public void test() {
		Assignment2 prime=new Assignment2();
		assertFalse(prime.isPrimeNumber(15));
	}
}
