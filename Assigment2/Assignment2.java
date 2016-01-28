/**
 * Assignment for your lecture 2.
 * Please finish all the questions under 'Assignment'.
 * Please try the two questions under 'Bonus'.
 * Please write some tests as practice.
 * When you are writing tests, you should think about what situations might cause error? like 0,-1...
 * The deadline of this assignment is 01/27/2016 23:59.
 * Please feel free to contact me for any questions.
 * @author Yang
 */

public class Assignment2 {
	
   
	//Assignment
	/**
	 * Given an integer N as input, check the following:
	 * If N is odd, print "Weird".
	 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
	 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
	 * If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n){
		
	     if (n%2!=0){
	    	 System.out.println("Weird");
	     }
	     if((n%2==0)&&(2<=n)&&(n<=5)){
	         System.out.println("Not Weird");
	     }
	     if((n%2==0)&&(6<=n)&&(n<=20)){
	    	 System.out.println("Weird");
	     }
	     if((n%2==0)&&(20<n)){
	         System.out.println("Not Weird");
	     }
	}
	
	/**
	 * Input an array of scores and return the right grades based on following rules
	 * 90<=score    -->4
	 * 80<=score<90 -->3
	 * 70<=score<80 -->2
	 * 60<=score<70 -->1
	 * score<60     -->0
	 */
	public int[] checkGrade(int[] scores){
		int[] num=new int[scores.length];
		for(int i=0;i<scores.length;i++){
			if(scores[i]>=90&&scores[i]<=100){
				num[i]= 4;}
			if(scores[i]>=80&&scores[i]<90){
				num[i]= 3;}
		     if(scores[i]>=70&&scores[i]<80){
		    	 num[i]= 2;}
		     if(scores[i]>=60&&scores[i]<70){
		    	 num[i]= 1;}
		     if(scores[i]>=0&&scores[i]<60){
		    	 num[i]= 0;}
		}
		return num;
	}
	
	/**
	 * Write a method to determine whether a number is prime 
	 */
	public boolean isPrimeNumber(int n){
		
		if(n<=1){
			return false;
		 }
		if(n>2){	
				for(int i=2;i<n;i++){
					if(n%i==0){
						return false;
					}
				}
		}
		return true;
	
	}
	
	/**
	 * Write a method to find N numbers which are power of three.
         * e.g. n=4, return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n){
	     int[] N = new int[n]; 
			for(int i=0; i<n; i++) {
				N[i]= (int) Math.pow(3, i); 
			}
			return N;
	}
	
	/**
	 * Count occurrences of a given letter in a given string.
	 */
	public int countLetter(String str,char c){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c){
				count++;
			}
		}
	return count;
	}

	/**
	 * Find maximum and minimum in a given array, and return the max and min number
	 */
	public int[] findMinMax(int[] nums){
		int[] minmax=new int[2];
         int max=(nums[0]);
         int min=(nums[0]);
		for(int i=0;i<nums.length;i++){
			if(nums[i]>=max){
				minmax[0]=nums[i];}
			if(nums[i]<=min){
				minmax[1]=nums[i];}
			}
		return minmax;
	}
	
	/**
	 * Find N fibonacci numbers
	 * Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1. 
	 */
	public int[] fibonacciNumber(int n){
		int f[]=new int[n];
		f[0]=1;
		f[1]=1;
		for(int i=2;i<f.length;i++){
			f[i]= f[i-1]+f[i-2];}
		return f;
	
	}
	
	
	
	//Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the result has only one digit.
	 * For example:
	 * Given n = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n){
		if(n<10){
			return n;
			}
		int sum=0,N=n,n1;
		while(true){
			n1=N%10;
			N=N/10;
			sum+=n1;
			if(N<=0)
				break;
			}
			if(sum>9){
				sum=addDigits(sum);
			}
			return sum;
	}
	
	/**
	 * Write a program to check whether a given number is an ugly number.
	 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes another prime factor 7.
	 * Note that 1 is typically treated as an ugly number.
	 */
	public boolean isUgly(int n){
		if(n<=0){
			return false;
		}
		if(n==1){
			return true;
		}
		while (n % 2 == 0) 
			n =n/ 2;
        while (n % 3 == 0) 
        	n =n/3;
        while (n % 5 == 0)
        	n =n/5;
         
        if (n == 1) {
            return true;
        } else {
            return false;
        }
	}

	public char[] countLetter(String str, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] findMinMax(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		return null;
	}



}

