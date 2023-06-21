package com.group9.rtds.service;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.group9.rtds.integration.KafkaProducer;

@Service
public class SchedulerService {

	Logger logger = LoggerFactory.getLogger(SchedulerService.class);
	
	@Autowired
	private KafkaProducer kafkaProducer;

	@Autowired
	private WeatherRtdisServiceImpl weatherRtdisService;

	@Value("${state}")
	private String state;

	@Scheduled(cron = "${scheduled.cron}")
	public void fetchWeatherData() {
		WeatherDTO weatherDTO = weatherRtdisService.fetchCurrentWeatherData(state);

		// Send to topic
		this.kafkaProducer.sendWeatherData(weatherDTO);
	}
}
