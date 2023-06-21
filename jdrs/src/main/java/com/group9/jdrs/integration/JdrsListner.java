package com.group9.jdrs.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
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

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public JdrsListner() {
	}

	@KafkaListener(topics = "RTDIS_IOWA", groupId = "group-id")
	public void receiveWeatherData(String weatherJson) {
		try {
			WeatherDTO weatherDTO = objectMapper.readValue(weatherJson, WeatherDTO.class);

			//Rip data
			WeatherDTO.CurrentDTO currentDTO = weatherDTO.getCurrent();
			WeatherDTO.LocationDTO locationDTO= weatherDTO.getLocation();

			//send to topics
			String currentDToString = objectMapper.writeValueAsString(currentDTO);
			kafkaTemplate.send("jdrs_current", currentDToString);

			String locationDToString = objectMapper.writeValueAsString(locationDTO);
			kafkaTemplate.send("jdrs_location", locationDToString);

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
