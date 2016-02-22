import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Finish all the assignments before next class.
 * 
 * @author Yang
 */

public class Assignment5 {
	/**
	 * In computer, the file system is very important. Try to create classes for
	 * file and folder. Hint: You might find there are many similarities between
	 * file and folder: they both have name, size and created date; they both
	 * could be open by double click; ... So use the concept of abstract class
	 * to make your code more neat.
	 */
	
	public abstract class Directory {
		String name;
		int size;
		Date dateCreated;
		
		public Directory(String name, Date dateCreated) {
			this.name = name;
			this.dateCreated = dateCreated;
			this.size = 2;
			
		}
		
		abstract Directory doubleClick();
		
		public Date getCreatedDate() {
			return this.dateCreated;
		}
				
		public void rename(String name){
			this.name = name;
		}
		
		public int getSize(){
			return this.size;
		}
		
		public String getName(){
			return this.name;
		}
	}
	
	public class File extends Directory {
		public File(String name, Date dateCreated) {
			super(name, dateCreated);
		}
		
		// open File
		public Directory doubleClick() {
			return this;  
		}
		
		// move File into Folder
		public void moveTo(Folder folder) {
			if (folder == null) {
				return;
			}
			folder.content.add(this);
		}
	}
	
	public class Folder extends Directory {
		List<Directory> content;
		
		public Folder(String name, Date dateCreated) {
			super(name, dateCreated);
			content = new ArrayList<Directory>();
		}
		
		// show Folder content
		public List<Directory> getContent() {
			return content;
		}
		
		// open Folder
		public Directory doubleClick() {
			return this;
		}
		
		//get number of items of the folder
		public int getNumOfItems() {
			if (content.isEmpty()) {
				return -1;
			}
			return content.size();
		}
	}

	

	/**
	 * Design abstract class Person, interface Driver, Teacher, Teenager, Adult.
	 * Then create classes TeenagerDriver, TeenagerTeacher, AdultDriver and
	 * AdultTeacher which extend Person and implement suitable interfaces.
	 */
	abstract class Person {

	}

	interface Driver {
		void drive();

	}

	interface Teacher {
		void teach();

	}

	interface Teenager {
		void play();
	}

	interface Adult {
		void work();
	}

	class AdultBusDriver implements Driver, Adult {

		@Override
		public void drive() {
			System.out.println("Driving from Downtown to Northgate.");
		}

		@Override
		public void work() {
			System.out.println("Working in the daytime.");

		}
	}

	class HighSchoolStudent implements Teenager {

		@Override
		public void play() {
			System.out.println("Play football on the ground.");
		}
	}

	class DriveTeacher implements Driver, Teacher {

		@Override
		public void teach() {
			System.out.println("Teaching driving");

		}

		@Override
		public void drive() {
			System.out.println("Driving in the Driving School");

		}

	}

	/**
	 * Rotate the input array in place(without extra space) e.g. input nums =
	 * {5,1,9,0}, after calling this method, the nums should be {0,9,1,5}
	 */
	public void rotateArrayInPlace(int[] nums) {
		int tmp;
		for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
			tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}
	}

	/**
	 * Rotate the input array without changing the input. Return the rotated
	 * array. e.g. input nums = {5,1,9,0}, after calling this method it'll
	 * return {0,9,1,5} while the nums is still {5,1,9,0}
	 */
	public int[] rotateArrayWithoutModifyInput(int[] nums) {
		int[] rotateNums = new int[nums.length];
		for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
			rotateNums[i] = nums[j];
		}
		return rotateNums;
	}

}
