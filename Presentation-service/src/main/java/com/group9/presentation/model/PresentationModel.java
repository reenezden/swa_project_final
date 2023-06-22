package com.group9.presentation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PresentationModel {

	@Id
	private String region;
	private int temperature;
	private int humidity;
	private int wind_speed;
	private String localtime;

	public PresentationModel() {

	}

	public PresentationModel(String region, int temperature, int humidity, int wind_speed, String localtime) {
		super();
		this.region = region;
		this.temperature = temperature;
		this.humidity = humidity;
		this.wind_speed = wind_speed;
		this.localtime = localtime;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(int wind_speed) {
		this.wind_speed = wind_speed;
	}

	public String getLocaltime() {
		return localtime;
	}

	public void setLocaltime(String localtime) {
		this.localtime = localtime;
	}

}
