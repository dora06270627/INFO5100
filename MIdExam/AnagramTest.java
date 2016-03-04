
public class AnagramTest {

	public static void main(String[] args) {
		MidExam anagram =new MidExam();
		String s1="abbba";
		String s2="bbbaa";
		boolean result=anagram.isAnagram(s1, s2);
		System.out.println(result);
		
		String a1="ast";
		String a2="sqq";
		boolean result2 =anagram.isAnagram(a1, a2);
		System.out.println(result2);
	}
}
