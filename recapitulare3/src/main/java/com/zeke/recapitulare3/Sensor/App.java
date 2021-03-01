package com.zeke.recapitulare3.Sensor;

import java.util.*;
public class App {
	LightSensor lightSensor = new LightSensor("LivingRoom");
	TemperatureSensor temperatureSensor = new TemperatureSensor("LivingRoom");
	
	Controller controller = Controller.getInstance(temperatureSensor, lightSensor);
	

}
