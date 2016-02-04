
public class findDuplictesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 duplictes=new Assignment3();
		int[] arr=new int[5];
		arr[0]=3;
		arr[1]=9;
		arr[2]=1;
		arr[3]=4;
		arr[4]=6;
		boolean result = duplictes.findDuplicates(arr);
		 if (result == true)
			  System.out.println("There have duplicates");
			  else
			  System.out.println("There have no duplicates");
			 }
	}


