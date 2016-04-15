
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * 4. Open a local file, read the file line by line. Each line should be
 * imported as a string and stored in ArrayList. Then print out the ArrayList
 * reversely. You can create your own file to test.
 */

public class ReadFile {
	private File f;
	private FileInputStream fis;
	private InputStreamReader isr;
	private BufferedReader br;

	public ReadFile(String str) throws IOException {
		f = new File(str);
		fis = new FileInputStream(f);
		isr = new InputStreamReader(fis);
		br = new BufferedReader(isr);
	}
	
	public ArrayList<String> readFile() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}
			list.add(line);
		}
		br.close();
		isr.close();
		fis.close();
		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.println(list.get(i));
		}
		return list;
	}
	
	public static void main(String[] args) throws Exception {
		ReadFile f = new ReadFile("/Users/fandonghan/desktop/suanfa.txt");
	    f.readFile();
	}
}
