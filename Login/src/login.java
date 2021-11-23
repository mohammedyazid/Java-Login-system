import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class login implements ActionListener{
	JFrame frame = new JFrame();
	JButton log_b = new JButton("Login");
	JTextField username_f = new JTextField();
	JPasswordField password_f = new JPasswordField();
	JLabel username_l = new JLabel("username ");
	JLabel pass_l = new JLabel("password ");
	JLabel message_l = new JLabel();
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	login(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
		username_l.setBounds(150,75,75,25);
		pass_l.setBounds(150,125,75,25);
		
		message_l.setBounds(125,10,250,35);
		message_l.setFont(new Font(null,Font.BOLD,15));
		
		username_f.setBounds(100,100,200,25);
		password_f.setBounds(100,150,200,25);
		
		log_b.setBounds(135,200,100,25);
		log_b.setFocusable(false);
		log_b.addActionListener(this);
		
		
		frame.add(username_l);
		frame.add(pass_l);
		frame.add(message_l);
		frame.add(username_f);
		frame.add(password_f);
		frame.add(log_b);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,450);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==log_b) {
			
			String username = username_f.getText();
			String password = String.valueOf(password_f.getPassword());
			
			if(logininfo.containsKey(username)) {
				if(logininfo.get(username).equals(password)) {
					frame.dispose();
					secondpage sec = new secondpage(username);
				}
				else {
					message_l.setForeground(Color.red);
					message_l.setText("Password Incorrect");
				}

			}
			else {
				message_l.setForeground(Color.orange);
				message_l.setText("Try a Different Username");
			}
		}
	}	
}