import java.util.Arrays;

public class deteleElementTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 detele=new Assignment3();
		int[] element=new int[5];
		element[0]=3;
		element[1]=6;
		element[2]=5;
		element[3]=7;
		element[4]=23;
		int[] arr;
		arr=detele.deteleElement(element,4);
		String arrString = Arrays.toString(arr);
		System.out.println(arrString);
	}

}
