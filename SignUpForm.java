package JFrames;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignUpForm {
	
	private JFrame ourFrame = new JFrame("Subscribe");
	
	SignUpForm(){
		
		ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds(200, 100, 400, 200);
		
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		
		JLabel logo = new JLabel("Subscribe to www.CodingWithMitch.com");
		logo.setBounds(60,5,250,30);
		
		JLabel name_label = new JLabel("Name :");
		name_label.setBounds(20,30,250,30);
		
		JLabel email_label = new JLabel("Email :");
		email_label.setBounds(20,60,250,30);
		
		JTextField nameText = new JTextField();
		nameText.setBounds(65,30,250,30);
		
		JTextField emailText = new JTextField();
		emailText.setBounds(65, 60, 250, 30);
		
		JButton subBtn  = new JButton("Subscribe");
		subBtn.setBounds(150,90,100,30);
		
		container.add(logo);
		container.add(name_label);
		container.add(email_label);
		container.add(nameText);
		container.add(emailText);
		container.add(subBtn);
		ourFrame.setVisible(true);
		
	}

}
