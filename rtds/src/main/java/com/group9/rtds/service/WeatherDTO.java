package com.group9.rtds.service;

import java.util.List;

public class WeatherDTO {

    private RequestDTO request;
    private LocationDTO location;
    private CurrentDTO current;

    public RequestDTO getRequest() {
        return request;
    }


    public void setRequest( RequestDTO request ) {

        this.request = request;
    }


    public LocationDTO getLocation() {

        return location;
    }


    public void setLocation( LocationDTO location ) {

        this.location = location;
    }


    public CurrentDTO getCurrent() {

        return current;
    }


    public void setCurrent( CurrentDTO current ) {

        this.current = current;
    }

    public static class RequestDTO {

        private String type;
        private String query;
        private String language;
        private String unit;

        // Getters and setters

        public String getType() {

            return type;
        }


        public void setType( String type ) {

            this.type = type;
        }


        public String getQuery() {

            return query;
        }


        public void setQuery( String query ) {

            this.query = query;
        }


        public String getLanguage() {

            return language;
        }


        public void setLanguage( String language ) {

            this.language = language;
        }


        public String getUnit() {

            return unit;
        }


        public void setUnit( String unit ) {

            this.unit = unit;
        }
    }

    public static class LocationDTO {

        private String name;
        private String country;
        private String region;
        private String lat;
        private String lon;
        private String timezone_id;
        private String localtime;
        private long localtime_epoch;
        private String utc_offset;

        // Getters and setters

        public String getName() {

            return name;
        }


        public void setName( String name ) {

            this.name = name;
        }


        public String getCountry() {

            return country;
        }


        public void setCountry( String country ) {

            this.country = country;
        }


        public String getRegion() {

            return region;
        }


        public void setRegion( String region ) {

            this.region = region;
        }


        public String getLat() {

            return lat;
        }


        public void setLat( String lat ) {

            this.lat = lat;
        }


        public String getLon() {

            return lon;
        }


        public void setLon( String lon ) {

            this.lon = lon;
        }


        public String getTimezone_id() {

            return timezone_id;
        }


        public void setTimezone_id( String timezone_id ) {

            this.timezone_id = timezone_id;
        }


        public String getLocaltime() {

            return localtime;
        }


        public void setLocaltime( String localtime ) {

            this.localtime = localtime;
        }


        public long getLocaltime_epoch() {

            return localtime_epoch;
        }


        public void setLocaltime_epoch( long localtime_epoch ) {

            this.localtime_epoch = localtime_epoch;
        }


        public String getUtc_offset() {

            return utc_offset;
        }


        public void setUtc_offset( String utc_offset ) {

            this.utc_offset = utc_offset;
        }
    }

    public static class CurrentDTO {

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


        public void setObservation_time( String observation_time ) {

            this.observation_time = observation_time;
        }


        public void setTemperature( int temperature ) {

            this.temperature = temperature;
        }


        public void setWeather_code( int weather_code ) {

            this.weather_code = weather_code;
        }


        public void setWeather_icons( List<String> weather_icons ) {

            this.weather_icons = weather_icons;
        }


        public void setWeather_descriptions( List<String> weather_descriptions ) {

            this.weather_descriptions = weather_descriptions;
        }


        public void setWind_speed( int wind_speed ) {

            this.wind_speed = wind_speed;
        }


        public void setWind_degree( int wind_degree ) {

            this.wind_degree = wind_degree;
        }


        public void setWind_dir( String wind_dir ) {

            this.wind_dir = wind_dir;
        }


        public void setPressure( int pressure ) {

            this.pressure = pressure;
        }


        public void setPrecip( int precip ) {

            this.precip = precip;
        }


        public void setHumidity( int humidity ) {

            this.humidity = humidity;
        }


        public void setCloudcover( int cloudcover ) {

            this.cloudcover = cloudcover;
        }


        public void setFeelslike( int feelslike ) {

            this.feelslike = feelslike;
        }


        public void setUv_index( int uv_index ) {

            this.uv_index = uv_index;
        }


        public void setVisibility( int visibility ) {

            this.visibility = visibility;
        }


        public void setIs_day( String is_day ) {

            this.is_day = is_day;
        }

    }
}
