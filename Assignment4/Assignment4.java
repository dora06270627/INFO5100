
/**
 * Finish all the assignments. Try Bonus.
 * 
 * @author Yang
 */

public class Assignment4 {

	// Assignments
	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {
		// Write Logic..
		if (str=="") {
			return 0;
		}
		int i = str.length() - 1;
		while (i >= 0) {
			if (str.charAt(i) != ' ')
				break;
			i--;
		}
		int end = i;
		while (i >= 0) {
			if (str.charAt(i) == ' ')
				break;
			i--;
		}
		return end - i;
	}

	/**
	 * Reverse a string by letters. Do not use 'split' function. e.g.
	 * "I like soccer" --> "reccos ekil I"
	 */
	public String reverseString1(String str) {
		// Write Logic
		String newString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newString += str.charAt(i);
		}
		return newString;
	}

	/**
	 * public String reverseString1(String str) { char[]
	 * CharArray=str.toCharArray(); StringBuilder sb=new StringBuilder();
	 * for(int i=CharArray.length-1; i>=0; i--){ sb.append(CharArray[i]); }
	 * String newString=sb.toString(); return newString; }
	 */

	/**
	 * Reverse a string by words. Do not use 'split' function. e.g.
	 * "I like soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {
		// Write logic
		char[] CharArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int end = str.length();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (CharArray[i] == ' ' || i == 0) {
				if (i == 0) {
					sb.append(str.substring(i, end));
				} else {
					sb.append(str.substring(i + 1, end));
					sb.append(" ");
				}
				end = i;
			}
		}
		String newString = sb.toString();
		return newString;

	}

	/**
	 * Count how many words in a string. Numbers are regarded as a word. Do not
	 * use 'split' function. e.g. "I like soccer" --> 3. "I have 15 dollars" -->
	 * 4
	 */
	public int countWords(String str) {//good job. think about ESC: what if input is "I am\nstudent".
		// Write Logic
		int count = 0;
		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				space = 0;//since 'space' could just be 0 and 1, you could use boolean instead of int
			} else if (str.charAt(i) != ' ' && space == 0) {
				space = 1;
				count++;
			}
		}
		return count;
	}

	/**
	 * Capitalize the first letters of words in a String. Do not use 'split'
	 * function. e.g. "I like soccer" --> "I Like Soccer".
	 */
	public String capitalizeLetters(String str) {
		// Write logic
		char[] CharArray = str.toCharArray();
		CharArray[0] = Character.toUpperCase(CharArray[0]);
		for (int i = 1; i < CharArray.length; i++) {
			if (Character.isWhitespace(CharArray[i - 1])) {
				CharArray[i] = Character.toUpperCase(CharArray[i]);
			}
		}
		return new String(CharArray);
	}

	/**
	 * Use enum to represent the type of vehicles, like Bus, Motorcycle, Sedan,
	 * SUV, Truck...
	 */
	public enum Type {
		Bus, Motorcycle, Sedan, SUV, Truck
	}

	/**
	 * Define a vehicle class. Use suitable encapsulation. Use the enum you
	 * defined to represent the types. There is no standard answer for this
	 * question, but you need create necessary attributes for this class, and
	 * methods if needed.
	 */
	static class Vehicle {
		private Vehicle type;
		private Vehicle color;

		public enum Type {
			Bus, Motorcycle, Sedan, SUV, Truck
		}

		public enum Color {
			Blue, Red, Yellow, Green
		}

		public void setType(Vehicle type) {
			this.type = type;
		}

		public Vehicle getType() {
			return type;
		}

		public void setColor(Vehicle color) {
			this.color = color;
		}

		public Vehicle getColor() {
			return color;
		}
	}

	// Bonus
	/**
	 * Count and Say. Count each character. e.g. "aabacbaa" --> "5a2b1c"
	 */
	public String countAndSay(String str) {
		// Write logic
		String result = "";
		int[] count= new int[100];//why 100? might be out of bound.            -2
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			count[charAt]++;
		}
		for (char j = 0; j < count.length; j++) {
			if (count[j] > 0)
				result = result+count[j] + j;
		}
		return result;
	}

	/**
	 * Compare version number. If equal, return 0. if larger, return 1. if
	 * smaller, return -1. You could use library functions of Integer and
	 * String, like parseInt, split. e.g. "1.2.3" VS "1.2.0" --> 1. "1.2" VS
	 * "1.2.0" --> 0. "100.200" VS "200.100" --> -1.
	 */
	public int compareVersion(String v1, String v2) {
		// Write logic
		String[] version1 = v1.split("\\.");
		String[] version2 = v2.split("\\.");
		int num1;
		int num2;
		for (int i = 0; i < Math.max(version1.length, version2.length); i++) {
			if (i < version1.length) {
				num1 = Integer.parseInt(version1[i]);
			} else {
				num1 = 0;
			}

			if (i < version2.length) {
				num2 = Integer.parseInt(version2[i]);
			} else {
				num2 = 0;
			}
			if (num1 != num2) {
				if (num1 > num2) {
					return 1;
				} else if (num1 < num2) {
					return -1;
				}
			}
		}

		return 0;
	}
}
