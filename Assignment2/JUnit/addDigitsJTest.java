import org.junit.Assert;
import org.junit.Test;

public class addDigitsJTest {

	@Test
	public void test() {
		Assignment2 add=new Assignment2();
		int result= add.addDigits(28);
		Assert.assertEquals(1, result);
	}

}
