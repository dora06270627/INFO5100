
public class twoSumTest {

	public static void main(String[] args) {
		MidExam result = new MidExam();
		int[] nums ={2,4,5,4,4,3};
		int number = result.twoSum(nums,7);
		System.out.println(number);

		int[] nums2 ={2,3,5,4};
		int number2 = result.twoSum(nums2,20);
		System.out.println(number2);
	}

}
