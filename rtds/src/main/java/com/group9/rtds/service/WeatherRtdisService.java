package com.group9.rtds.service;

public interface WeatherRtdisService {

	WeatherDTO fetchCurrentWeatherData(String state);

	WeatherDTO fetchHistoricalWeatherData();

	WeatherDTO fetchForecastWeatherData();
}
