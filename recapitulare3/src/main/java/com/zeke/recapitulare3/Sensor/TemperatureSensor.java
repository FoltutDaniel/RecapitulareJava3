package com.zeke.recapitulare3.Sensor;

import java.util.Random;

public class TemperatureSensor extends Sensor{

	public TemperatureSensor(String location) {
		super(location);
	}
	
	@Override
	public int readValue() {
		Random random = new Random();
		return random.nextInt(100);
	}

}
