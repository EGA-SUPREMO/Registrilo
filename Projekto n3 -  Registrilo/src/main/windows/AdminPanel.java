package main.windows;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminPanel extends JPanel {
	
	private JPanel section;
	
	private JButton edit;
	private JButton see;
	private JTextField search;
	
	private SeeProfilePanel seePanel;
	private EditProfilePanel editPanel;
	
	public AdminPanel() {
		inizializeVars();
		inizialize();
		
	}

	private void inizializeVars() {
		if(false);
		
		section = new JPanel();
		
		edit = new JButton("Editar perfiles");
		see = new JButton("Ver perfiles");
		search = new JTextField(20);
		
		seePanel = new SeeProfilePanel();
		editPanel = new EditProfilePanel();
		
		section.add(see);
		section.add(edit);
		section.add(search);
	}

	private void inizialize() {
		setLayout(new BorderLayout());
		add(section, BorderLayout.NORTH);
		add(seePanel, BorderLayout.CENTER);
	}
	
}
