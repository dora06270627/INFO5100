


import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
  
	private double result;
	private String lastCommand;
	private boolean start;
	private CalPanel panel;

	public Calculator() {

		setTitle("Calculator");
		panel = new CalPanel();
		add(panel);
		makeItVisible();
	}



	private void makeItVisible() {
		this.setSize(300, 400);
		this.setVisible(true);
		setLocationRelativeTo(null); // show in the center
	}

	class CalPanel extends JPanel {
		JTextField textField = new JTextField();

		public CalPanel() {
			setLayout(new GridBagLayout());
			
			textField.setFont(new Font("calFont", Font.PLAIN, 20));
			textField.setEditable(false);
			textField.setHorizontalAlignment(JTextField.RIGHT);
			

			result = 0; 
			lastCommand = "=";
			start = true;

			String[] calButtons = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
					"+", // 10
					"AC", // 11
					"-", // 12
					"/", // 13
					"*", // 14
					".", // 15
					"=", // 16
					"+/-",  // 17
					"%" // 18
					}; 

			ArrayList<JButton> button = new ArrayList<JButton>();
			for (int i = 0; i < calButtons.length; i++) {
				button.add(new JButton("" + calButtons[i]));
				button.get(i).addActionListener(new ButtonsActionListener());
				button.get(i).setFont(new Font("calFont", Font.PLAIN, 17));
				
			}
			
			add(textField, new GridBagConstraints(0, 0, 4, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(11), new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(17), new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(18), new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(13), new GridBagConstraints(3, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(7), new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(8), new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(9), new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(14), new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(4), new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(5), new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(6), new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(12), new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(1), new GridBagConstraints(0, 5, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(2), new GridBagConstraints(1, 5, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(3), new GridBagConstraints(2, 5, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(10), new GridBagConstraints(3, 5, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(0), new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(15), new GridBagConstraints(2, 6, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
			add(button.get(16), new GridBagConstraints(3, 6, 1, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		}
	}

	class ButtonsActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = e.getActionCommand();
			boolean isDigit = Character.isDigit(input.charAt(0));

			if (isDigit || input.equals(".")) {
				if (start) {
					panel.textField.setText("");
					start = false;
				}
				panel.textField.setText(panel.textField.getText() + input);

			} else if (input.equals("AC")) {
				panel.textField.setText("");
				result = 0;
				lastCommand = "=";
				start = true;

			} else {
				if (start) {
					if (input.equals("-")) { // check for negative number
						panel.textField.setText(input);
						start = false;
					} else {
						lastCommand = input;
					}
				} else {
					calculate(Double.parseDouble(panel.textField.getText()));
					lastCommand = input;
					start = true;
				}
			}
		}

		// calculate and display the result
		public void calculate(double x) {
			String error = "";
			if (lastCommand.equals("+")) {
				result += x;
			} else if (lastCommand.equals("-")) {
				result -= x;
			} else if (lastCommand.equals("*")) {
				result *= x;
			} else if (lastCommand.equals("/")) {
				if (x != 0) {
					result /= x;
				} else {
					result = 0;
					error = "Div/0 ERROR!";
				}
			} else if (lastCommand.equals("%")) {
				result = x / 100;
			} else if (lastCommand.equals("+/-")) {
				result = x * (-1);
			} else if (lastCommand.equals("=")) {
				result = x;
			}
			if ("".equals(error)) {
				panel.textField.setText("" + result);
			} else {
				panel.textField.setText(error);
			}
		}

	}

	public static void main(String[] args) {
		new Calculator();

	}
}

