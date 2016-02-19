import org.junit.Assert;
import org.junit.Test;

public class checkMessageJTest {

	@Test
	public void test() {
		Assignment3 check=new Assignment3();
		int count= check.checkMessage("AOSSOSSOP");
		Assert.assertEquals(2, count);
	}

}
