package objects;

public class Profile {

	private String name;
	private String type;
	private int ci;
	private boolean active;
	
	public Profile() {
		
	}
	
	public final String getName() {
		return name;
	}
	public final void setName(final String name) {
		this.name = name;
	}
	public final String getType() {
		return type;
	}
	public final void setType(final String type) {
		this.type = type;
	}
	public final int getCi() {
		return ci;
	}
	public final void setCi(final int ci) {
		this.ci = ci;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
