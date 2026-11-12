package PRORGAMMMING_ZERO_ONE;

import javax.swing.*;

public class GreeterApp {
	public static void main(String[] args) {
	JFrame frame = new JFrame("Greeter");
	JTextField nameField = new JTextField(12);
	JButton greetButton = new JButton("Greet");
	JLabel messageLabel = new JLabel ("Type your name");
		
	greetButton.addActionListener(e -> {		
	String name = nameField.getText();
	if (name.isEmpty()) {
	messageLabel.setText("Please type your name");
	} else {
	messageLabel.setText("Hello, " + name + "!");
	}
	} );
		
	frame.setLayout(new java.awt.FlowLayout());
	frame.add(nameField);
	frame.add(greetButton);
	frame.add(messageLabel);
	frame.setSize(320, 120);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

	}
}