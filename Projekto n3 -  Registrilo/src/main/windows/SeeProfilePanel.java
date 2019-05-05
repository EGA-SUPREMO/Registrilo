package main.windows;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.database.Database;
import main.objects.Profile;

public class SeeProfilePanel extends JPanel {

	private JLabel name;
	private JLabel type;
	private JLabel ci;
	private JLabel active;
	
	private Profile lastProfile;
	private JPanel days;
	
	public SeeProfilePanel() {
		inizialize();
		setPanel();
	}
	
	private void inizialize() {
		lastProfile = Database.getLastProfile();
		
		name = new JLabel(lastProfile.getName());
		name.setFont(name.getFont().deriveFont(17f));
		ci = new JLabel("CI: " + lastProfile.getCi());
		ci.setFont(name.getFont());
		type = new JLabel("Tipo de empleado: " + lastProfile.getType());
		type.setFont(name.getFont());
		active = new JLabel("Estado: " + lastProfile.state());
		active.setFont(name.getFont());
		
	}
	
	private void setPanel() {
		add(name);
		add(ci);
		add(type);
		add(active);
	}
	
}