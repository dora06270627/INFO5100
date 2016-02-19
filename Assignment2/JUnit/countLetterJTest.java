import org.junit.Assert;
import org.junit.Test;

public class countLetterJTest {

	@Test
	public void test() {
		Assignment2 count=new Assignment2();
		int result= count.countLetter("Doralikerun",'r');
		Assert.assertEquals(2, result);
	}

}
