
public class MaxMinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Assignment2 Minmax= new Assignment2();
       int[] n = new int[4];
       int[] minmax;
       n[0]= 23;
       n[1]= 46;
       n[2]= -7;
       n[3]= 3;	   
      minmax=Minmax.findMinMax(n);   
      System.out.println(minmax[0]+ " "+ minmax[1]);
	}
}

