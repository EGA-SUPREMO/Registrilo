package objects;

import java.util.Date;

public class Assistence {
	
	private String justific;//TODO please get better word for this.
	private Date date;
	private byte state;
	
	public Assistence(final Date date, final String justific, final byte state) {
		this.date = date;
		this.justific = justific;
		this.state = state;
	}

	public final String getJustific() {
		return justific;
	}

	public final void setJustific(String justific) {
		this.justific = justific;
	}

	public final Date getDate() {
		return date;
	}

	public byte getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}
	
}