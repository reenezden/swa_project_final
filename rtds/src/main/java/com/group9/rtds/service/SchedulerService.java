package com.group9.rtds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.group9.rtds.integration.KafkaProducer;

@Service
public class SchedulerService {

	@Autowired
	private KafkaProducer kafkaProducer;

	@Autowired
	private WeatherRtdisServiceImpl weatherRtdisService;

	@Value("${state}")
	private String state;

	@Scheduled(cron = "${scheduled.cron}")
	public void fetchWeatherData() {
		WeatherDTO weatherDTO = weatherRtdisService.fetchCurrentWeatherData(state);
		System.out.println("Fetch data " + state);
		// Send to topic
		this.kafkaProducer.sendWeatherData(weatherDTO);
	}
}
