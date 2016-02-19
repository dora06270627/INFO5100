import org.junit.Assert;
import org.junit.Test;

public class lengOfLastWordJTest {

	@Test
	public void test() {
		Assignment4 leng = new Assignment4();
		int result=leng.lengthOfLastWord("I like soccer");
		Assert.assertEquals(6, result);
	}

}
