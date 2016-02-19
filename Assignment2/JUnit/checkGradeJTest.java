import org.junit.Assert;
import org.junit.Test;

public class checkGradeJTest {

	@Test
	public void test() {
		Assignment2 grade=new Assignment2();
		int[] scores= {93,82,76,68,54};
		 int[] num = grade.checkGrade(scores);
		 int[] expectresult={4,3,2,1,0};
		 Assert.assertArrayEquals(expectresult,num);
	}

}
