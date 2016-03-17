import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MidExam {

	public void moveZeroes(int[] nums) {//+5
		if (nums == null || nums.length == 0) {
			return;
		}
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				index++;
				continue;
			}
			int temp = nums[i - index];
			nums[i - index] = nums[i];
			nums[i] = temp;
		}
	}

	public boolean isAnagram(String s, String t) {//sort is too expensive.            -2
		if (s == null && t == null) {
			return true;
		}
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}
		char s1[] = s.toCharArray();
		char t1[] = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		s = String.valueOf(s1);
		t = String.valueOf(t1);
		return s.equals(t);
	}

	public boolean containsDuplicate(int[] nums) {// +5
		Set<Integer> hashset = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hashset.contains(nums[i])) {
				return true;
			} 
			else {
				hashset.add(nums[i]);
			}
		}
		return false;
	}
	
	public int titleToNumber(String title) {
		 int result = 0;
	        if (title == null) 
	        	return 0;
	        for (int i=0; i<title.length(); ++i) {
	            result = result* 26 + title.charAt(i) - 'A' + 1;
	        }
	        return result;
    }
	
	public int twoSum(int[] nums, int target) {// +15
		Set<Integer> hasset = new HashSet<Integer>();
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if (hasset.contains(target - nums[i])) {
				count++;
			} 
			else {
				hasset.add(nums[i]);
			}
		}
		return count;
	}
}


