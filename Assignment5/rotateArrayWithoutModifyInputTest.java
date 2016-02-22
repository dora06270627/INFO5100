import java.util.Arrays;

public class rotateArrayWithoutModifyInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment5 rotate = new Assignment5();
		int[] nums={5,1,9,0};
		int[] result=rotate.rotateArrayWithoutModifyInput(nums);
		System.out.println("The rotate array is"+" "+Arrays.toString(result));
	    System.out.println("The original array is"+" "+Arrays.toString(nums));
	}
}
