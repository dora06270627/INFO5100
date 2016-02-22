import java.util.Date;


public class FileAndFolderTest {

	public static void main(String[] args) {
		Assignment5 test = new Assignment5();
		Assignment5.Folder doraFolder = test.new Folder("Dora", new Date());
		Assignment5.File doraFile = test.new File("Joe",new Date());
	    doraFile.moveTo(doraFolder);
	    System.out.println(doraFolder.getName());
	    System.out.println(doraFolder.getSize());
	    System.out.println(doraFolder.getNumOfItems());
	    Assignment5.Directory kris = doraFolder.getContent().get(0);
	    System.out.println(kris.getCreatedDate());
	    System.out.println(kris.getName());
	    doraFile.rename("Gia");
	    System.out.println(doraFile.getName());
	}
}
