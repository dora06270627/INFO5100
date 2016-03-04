
public class DuplicateTest {

	public static void main(String[] args) {
		MidExam dup =new MidExam();
		int[] arr ={2,4,5,4,4,3};
		boolean result = dup.containsDuplicate(arr);
		System.out.println(result);
		
		int[] arr2 ={24,5,72,4,3};
		boolean result2 = dup.containsDuplicate(arr2);
		System.out.println(result2);
	}

}
