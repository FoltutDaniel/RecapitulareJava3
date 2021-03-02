package com.zeke.recapitulare3.Sensor;

import java.util.*;
public class App {
	public static void main(String[] args) {
		LightSensor lightSensor = new LightSensor("LivingRoom");
		TemperatureSensor temperatureSensor = new TemperatureSensor("LivingRoom");
		
		Controller controller = Controller.getInstance(temperatureSensor, lightSensor);
		controller.control();
	}
	
	

}
