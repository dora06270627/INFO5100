
import org.junit.Assert;
import org.junit.Test;

public class reverseJTest2 {

	@Test
	public void test() {
		Assignment4 reverse2 = new Assignment4();
		String result=reverse2.reverseString2("I like soccer");
		Assert.assertEquals("soccer like I", result);
	}

}
