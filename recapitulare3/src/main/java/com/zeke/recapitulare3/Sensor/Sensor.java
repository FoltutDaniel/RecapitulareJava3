package com.zeke.recapitulare3.Sensor;

public abstract class Sensor {
	protected String location;
	
	public Sensor(String location2) {
		this.location = location2;
	}
	public abstract int readValue();
	public String getLocation() {
		return location;
	}
}
