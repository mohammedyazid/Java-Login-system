import java.awt.*;
import javax.swing.*;

public class secondpage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hi!");
	
	secondpage
(String Username){
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.BOLD,15));
		welcomeLabel.setText("Welcome "+Username+" :>");
		welcomeLabel.setForeground(Color.GREEN);
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}