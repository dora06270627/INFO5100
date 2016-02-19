import org.junit.Assert;
import org.junit.Test;

public class countDigitsJTest {

	@Test
	public void test() {
		Assignment3 count=new Assignment3();
		int result=count.countDigits(100);
		Assert.assertEquals(1, result);
	}

}
