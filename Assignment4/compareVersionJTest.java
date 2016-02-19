import org.junit.Assert;
import org.junit.Test;

public class compareVersionJTest {

	@Test
	public void test() {
		Assignment4 version = new Assignment4();
		int result = version.compareVersion("1.1.1", "1.2.0");
		Assert.assertEquals(-1,result);
		
		int result1 = version.compareVersion("2.1.1", "1.2.0");
		Assert.assertEquals(1,result1);
		
		int result2 = version.compareVersion("2.1", "2.1.0");
		Assert.assertEquals(0,result2);
	}

}
