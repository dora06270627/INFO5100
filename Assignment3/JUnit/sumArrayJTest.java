import org.junit.Assert;
import org.junit.Test;

public class sumArrayJTest {

	@Test
	public void test() {
		Assignment3 sumArray=new Assignment3();
		int[] arr={3,9,12,7,27};
		int sum=sumArray.sumArray(arr);
		Assert.assertEquals(58,sum);
	}

}
