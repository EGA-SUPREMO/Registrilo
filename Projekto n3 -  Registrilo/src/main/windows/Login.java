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
	
	private static final String welc = "Bienvenido ";
	private JLabel ci;
	private JLabel welcome;
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
		welcome = new JLabel(welc);
		welcome.setFont(ci.getFont());
		next = new JButton("Siguiente");
		next.setFont(ci.getFont());
		next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!inputCi.getText().equals("") && Database.isRegistered()) {
					
					Database.registerAssistence(inputCi.getText());
					welcome.setText(welc + Database.getName(Integer.parseInt(inputCi.getText())));
					
					inputCi.setText("");
					
					remove(next);
					remove(ci);
					remove(inputCi);
					add(welcome);
					updateUI();
					
					
					
				}
			}
			
		});
	}
	
}