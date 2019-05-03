package main.windows;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainWindows extends JFrame {
	
	private boolean isAdmin = true;
	private boolean hasLogin;
	private AdminPanel admin;
	private Login login;
	
	public MainWindows() {
		inizialize();
		setWindow();
	}
	
	private void inizialize() {
		if(false);
		
		admin = new AdminPanel();
		login = new Login();
		
		hasLogin = true;
	}
	
	private void setWindow() {
		
		setTitle("Registro de Asistencia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		add(login, BorderLayout.CENTER);
		setUndecorated(true);
		setExtendedState(MAXIMIZED_BOTH);
		
		pack();
		
		setLocationRelativeTo(null);
		
		setVisible(true);
		
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}
	public void changePanel() {
		if(hasLogin && isAdmin) {
			remove(login);
			hasLogin = false;
			add(admin, BorderLayout.CENTER);
			setSize(700, 666);
		} else if(!hasLogin && !isAdmin) {
			remove(admin);
			add(login, BorderLayout.CENTER);
			pack();
		}
	}
	
}