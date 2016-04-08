import java.io.File;

public class FindFiles {

	public int findFiles(String directory, String ext) {
		int count = 0;
		File dir = new File(directory);
		File[] files = dir.listFiles();
		if (dir.isDirectory()) {
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					findFiles(files[i].getAbsolutePath(), ext);
				} else {
					files[i].getAbsolutePath().endsWith(ext);
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws Exception {
		FindFiles findFiles = new FindFiles();

		int count = findFiles.findFiles("/Users/fandonghan/desktop", ".txt");
		System.out.println(count);
	}
}
