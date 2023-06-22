package com.group9.presentation.model;

import java.util.List;

public class CurrentDTO {
    private String observation_time;
    private int temperature;
    private int weather_code;
    private List<String> weather_icons;
    private List<String> weather_descriptions;
    private int wind_speed;
    private int wind_degree;
    private String wind_dir;
    private int pressure;
    private int precip;
    private int humidity;
    private int cloudcover;
    private int feelslike;
    private int uv_index;
    private int visibility;
    private String is_day;

    public CurrentDTO() {
    }

    public CurrentDTO(String observation_time, int temperature, int weather_code, List<String> weather_icons, List<String> weather_descriptions, int wind_speed, int wind_degree, String wind_dir, int pressure, int precip, int humidity, int cloudcover, int feelslike, int uv_index, int visibility, String is_day) {
        this.observation_time = observation_time;
        this.temperature = temperature;
        this.weather_code = weather_code;
        this.weather_icons = weather_icons;
        this.weather_descriptions = weather_descriptions;
        this.wind_speed = wind_speed;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.pressure = pressure;
        this.precip = precip;
        this.humidity = humidity;
        this.cloudcover = cloudcover;
        this.feelslike = feelslike;
        this.uv_index = uv_index;
        this.visibility = visibility;
        this.is_day = is_day;
    }

    public String getObservation_time() {

        return observation_time;
    }

    public int getTemperature() {

        return temperature;
    }

    public int getWeather_code() {

        return weather_code;
    }

    public List<String> getWeather_icons() {

        return weather_icons;
    }

    public List<String> getWeather_descriptions() {

        return weather_descriptions;
    }

    public int getWind_speed() {

        return wind_speed;
    }

    public int getWind_degree() {

        return wind_degree;
    }

    public String getWind_dir() {

        return wind_dir;
    }

    public int getPressure() {

        return pressure;
    }

    public int getPrecip() {

        return precip;
    }

    public int getHumidity() {

        return humidity;
    }

    public int getCloudcover() {

        return cloudcover;
    }

    public int getFeelslike() {

        return feelslike;
    }

    public int getUv_index() {

        return uv_index;
    }

    public int getVisibility() {

        return visibility;
    }

    public String getIs_day() {

        return is_day;
    }

    public void setObservation_time(String observation_time) {

        this.observation_time = observation_time;
    }

    public void setTemperature(int temperature) {

        this.temperature = temperature;
    }

    public void setWeather_code(int weather_code) {

        this.weather_code = weather_code;
    }

    public void setWeather_icons(List<String> weather_icons) {

        this.weather_icons = weather_icons;
    }

    public void setWeather_descriptions(List<String> weather_descriptions) {

        this.weather_descriptions = weather_descriptions;
    }

    public void setWind_speed(int wind_speed) {

        this.wind_speed = wind_speed;
    }

    public void setWind_degree(int wind_degree) {

        this.wind_degree = wind_degree;
    }

    public void setWind_dir(String wind_dir) {

        this.wind_dir = wind_dir;
    }

    public void setPressure(int pressure) {

        this.pressure = pressure;
    }

    public void setPrecip(int precip) {

        this.precip = precip;
    }

    public void setHumidity(int humidity) {

        this.humidity = humidity;
    }

    public void setCloudcover(int cloudcover) {

        this.cloudcover = cloudcover;
    }

    public void setFeelslike(int feelslike) {

        this.feelslike = feelslike;
    }

    public void setUv_index(int uv_index) {

        this.uv_index = uv_index;
    }

    public void setVisibility(int visibility) {

        this.visibility = visibility;
    }

    public void setIs_day(String is_day) {

        this.is_day = is_day;
    }

    @Override
    public String toString() {
        return "CurrentDTO [observation_time=" + observation_time + ", temperature=" + temperature
                + ", weather_code=" + weather_code + ", weather_icons=" + weather_icons + ", weather_descriptions="
                + weather_descriptions + ", wind_speed=" + wind_speed + ", wind_degree=" + wind_degree
                + ", wind_dir=" + wind_dir + ", pressure=" + pressure + ", precip=" + precip + ", humidity="
                + humidity + ", cloudcover=" + cloudcover + ", feelslike=" + feelslike + ", uv_index=" + uv_index
                + ", visibility=" + visibility + ", is_day=" + is_day + "]";
    }

}
