import org.junit.Assert;
import org.junit.Test;

public class capitalizeJTest {

	@Test
	public void testCapitalize() {
		Assignment4 capitalize = new Assignment4();
		String result=capitalize.capitalizeLetters("I like soccer");
		//String expectedResult = "I Like Soccer";
		Assert.assertEquals("I Like Soccer", result);
		//Assert.assertTrue(expectedResult==result);
	}

}
