import java.awt.*;
import java.awt.event.*;

public class AWT_andSwing_JavaGUIDevelopment {

	public static void main(String[] args) {
		// Create a Frame
		Frame frame = new Frame("Basic AWT Example");
		frame.setSize(400,300);
		frame.setLayout(new FlowLayout());
		
		// Create a Label
		Label headerLabel = new Label("Welcome to AWT Programming");
		headerLabel.setFont(new Font ("Arial", Font.BOLD, 18));
		
		// Create a Button
		Button button = new Button("Click Me");
		
		// Create a TextField
		TextField textField = new TextField(20);
		textField.setText("Enter your name");
		
		// Add.action listener to the button
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				if (name.trim().length() > 0) {
					headerLabel.setText("Hello, " + name + "!");
				} else {
					headerLabel.setText("Pkease enter your name");
				}
			}
	   });
		
		// Add window closing event
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		// Add components to the frame
		frame.add(headerLabel);
		frame.add(textField);
		frame.add(button);
		
		// Center the frame
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - frame.getWidth()) / 2;
		int y = (screenSize.height - frame.getHeight()) /2;
		frame.setLocation(x, y);
		
		// Display the frame
		frame.setVisible(true);
   }
} 
