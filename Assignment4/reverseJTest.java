import org.junit.Assert;
import org.junit.Test;

public class reverseJTest {

	@Test
	public void test() {
		Assignment4 reverse = new Assignment4();
		String result=reverse.reverseString1("I like soccer");
		Assert.assertEquals("reccos ekil I", result);
	}

}
