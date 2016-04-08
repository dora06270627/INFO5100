import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 4. Open a local file, read the file line by line. Each line should be
 * imported as a string and stored in ArrayList. Then print out the ArrayList
 * reversely. You can create your own file to test.
 */

public class ReadFileReverse {

	public static void readFileReverse(FileInputStream fis) throws IOException {

		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
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
		
		Collections.reverse(list);
		for (int i = 0; i <= list.size() - 1; i++) {
			System.out.println(list.get(i));
		}

	}

	public static void main(String[] args) throws Exception {
		File f = new File("/Users/fandonghan/desktop/suanfa.txt");
		FileInputStream fis = new FileInputStream(f);
		readFileReverse(fis);
	}
}