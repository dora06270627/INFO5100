// Based on the question 4 of assignment 6. 
//Create a button and text area in Swing, 
//every time you click the button, the text area will show the next line of a file.


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ReadFileWindow extends JFrame {
	private JTextArea textArea;
	private JButton readNextLine;
	private ArrayList<String> list;
	private int count = 0;
	

	public ReadFileWindow(String str) throws IOException {
		setTitle("File Reader");
		createComponents();
		addComponents();
		addListeners();
		makeItVisible();
		list = new ReadFile(str).readFile();
	}

	private void makeItVisible() {
		this.setSize(600, 300);
		this.setVisible(true);
		setLocation(400, 400);
	}

	private void addListeners() {
		ReadListener e = new ReadListener();
		readNextLine.addActionListener(e);

	}

	class ReadListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			textArea.append(list.get(count++) + "\n");
		}

	}

	private void addComponents() {
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(textArea);
		getContentPane().add(readNextLine);
		
		
	}

	private void createComponents() {
		textArea = new JTextArea(20,30);
		readNextLine = new JButton("Next");

	}

	public static void main(String[] args) throws IOException {
		new ReadFileWindow("/Users/fandonghan/desktop/suanfa.txt");

	}
}
