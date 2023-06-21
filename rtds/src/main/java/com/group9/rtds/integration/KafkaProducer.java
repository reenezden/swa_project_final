package com.group9.rtds.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.group9.rtds.service.WeatherDTO;

@Service
public class KafkaProducer {

	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {

		this.kafkaTemplate = kafkaTemplate;
	}

	@Value("${kafka.topic}")
	private String topic;

	public void sendWeatherData(WeatherDTO weatherDTO) {

		try {
			System.out.println("Temp: " + weatherDTO.getCurrent().getTemperature());
			String weatherJson = objectMapper.writeValueAsString(weatherDTO);
			System.out.println("Json" + weatherJson);
			kafkaTemplate.send(topic, weatherJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
