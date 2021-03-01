package com.zeke.recapitulare3.Sensor;

public class Controller {
	private static Controller single_instance = null;
	private TemperatureSensor temperatureSensor;
	private LightSensor lightSensor;
	public String s;

	private Controller(TemperatureSensor temperatureSensor, LightSensor lightSensor) {
		this.lightSensor = lightSensor;
		this.temperatureSensor = temperatureSensor;
	}
	
	public static Controller getInstance(TemperatureSensor temperatureSensor, LightSensor lightSensor) {
		if(single_instance == null) {
			single_instance = new Controller(temperatureSensor, lightSensor);
		}
		return single_instance;
	}
	
	public void control() {
		s = "Ligh sensor value: "+lightSensor.readValue() +"/n/r" + "Temperature sensor value: "+temperatureSensor.readValue();
	}
}
