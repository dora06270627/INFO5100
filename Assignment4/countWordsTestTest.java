import org.junit.Assert;
import org.junit.Test;

public class countWordsTestTest {

	@Test
	public void test() {
		Assignment4 count = new Assignment4();
		int result=count.countWords("I like soccer");
		Assert.assertEquals(3, result);
	}

}
