package com.group9.jdrs.integration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.group9.jdrs.service.WeatherDTO;

@Service
public class JdrsListner {

	@Value(value = "${kafka.topic}")
	private String topic;

	@KafkaListener(topics = "RTDIS_IOWA", groupId = "gid")
	public void sendWeatherData(WeatherDTO weatherDTO) {
		System.out.println("Weather " + weatherDTO.getCurrent().getFeelslike());
	}
}
