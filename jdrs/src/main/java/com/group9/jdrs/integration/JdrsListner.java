package com.group9.jdrs.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.group9.jdrs.service.WeatherDTO;

@Service
public class JdrsListner {

	@Value(value = "${kafka.topic}")
	private String topic;

	@Autowired
	private ObjectMapper objectMapper;

	@KafkaListener(topics = "RTDIS_IOWA", groupId = "group-id")
	public void sendWeatherData(String weatherJson) {
		try {
			WeatherDTO weatherDTO = objectMapper.readValue(weatherJson, WeatherDTO.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Weather Man" + weatherJson);
	}
}
