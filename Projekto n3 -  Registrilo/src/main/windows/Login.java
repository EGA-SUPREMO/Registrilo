package main.windows;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.database.Database;

public class Login extends JPanel {
	
	private JLabel ci;
	private JTextField inputCi;
	private JButton next;
	
	public Login() {
		inizialize();
		
		setLayout(new GridLayout());
		add(ci);
		add(inputCi);
		add(next);
		
	}
	
	private void inizialize() {
		ci = new JLabel("Cédula:");
		ci.setFont(ci.getFont().deriveFont(30f));
		inputCi = new JTextField(6);
		inputCi.setFont(ci.getFont());
		next = new JButton("Siguiente");
		next.setFont(ci.getFont());
		next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!inputCi.getText().equals("") && Database.isRegistered()) {
					inputCi.setText("");
					
					Database.registerAssistence(inputCi.getText());
				}
			}
			
		});
	}
	
}