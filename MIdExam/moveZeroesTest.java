import java.util.Arrays;

public class moveZeroesTest {

	public static void main(String[] args) {
		MidExam move = new MidExam();
		int[] nums={5,1,0,9,2,0};
		move.moveZeroes(nums);
		String N = Arrays.toString(nums);
	    System.out.println(N);
	}
}
