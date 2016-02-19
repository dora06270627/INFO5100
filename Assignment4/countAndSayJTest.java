import org.junit.Assert;
import org.junit.Test;

public class countAndSayJTest {

	@Test
	public void test() {
		Assignment4 count= new Assignment4();
		String result= count.countAndSay("aaabbccc");
		Assert.assertEquals("3a2b3c", result);
	}
}
