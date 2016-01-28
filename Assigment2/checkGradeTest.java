
public class checkGradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 grade=new Assignment2();
		int[] scores= new int[5];
		int[] num;
		 scores[0] = 93;
		 scores[1] = 82;
		 scores[2] = 76;
		 scores[3] = 68;
		 scores[4] = 54;
		 num = grade.checkGrade(scores);
		 System.out.println(num[0]+"  "+num[1]+"  "+num[2]+"  "+num[3]+"  "+num[4] );		 
	}
}
