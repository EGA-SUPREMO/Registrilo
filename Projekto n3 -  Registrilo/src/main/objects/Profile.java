package main.objects;

public class Profile {

	private String name;
	private String type;
	private int ci;
	private byte active;
	
	public Profile(final String name, final String type, final int ci) {
		this.name = name;
		this.type = type;
		this.ci = ci;
		this.active = 1;
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
	public byte isActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}

	public String state() {
		if(active==0)
			return "Despedido";
		else if(active==1)
			return "Activo";
		else if(active==-1)
			return "De reposo";
		else
			return "Error";
	}
	
}
