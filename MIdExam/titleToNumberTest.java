
public class titleToNumberTest {

	public static void main(String[] args) {
		MidExam num = new MidExam();
		String title = "B";
		int result =num.titleToNumber(title);
		System.out.println(title+"->"+result);
		
		String title2 = "AB";
		int result2 =num.titleToNumber(title2);
		System.out.println(title2+"->"+result2);

	}

}
