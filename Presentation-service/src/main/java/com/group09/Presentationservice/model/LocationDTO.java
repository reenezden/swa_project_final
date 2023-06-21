package com.group09.Presentationservice.model;

public class LocationDTO {
    private String name;
    private String country;
    private String region;
    private String lat;
    private String lon;
    private String timezone_id;
    private String localtime;
    private long localtime_epoch;
    private String utc_offset;

    public LocationDTO() {
    }

    public LocationDTO(String name, String country, String region, String lat, String lon, String timezone_id, String localtime, long localtime_epoch, String utc_offset) {
        this.name = name;
        this.country = country;
        this.region = region;
        this.lat = lat;
        this.lon = lon;
        this.timezone_id = timezone_id;
        this.localtime = localtime;
        this.localtime_epoch = localtime_epoch;
        this.utc_offset = utc_offset;
    }

    // Getters and setters

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getRegion() {

        return region;
    }

    public void setRegion(String region) {

        this.region = region;
    }

    public String getLat() {

        return lat;
    }

    public void setLat(String lat) {

        this.lat = lat;
    }

    public String getLon() {

        return lon;
    }

    public void setLon(String lon) {

        this.lon = lon;
    }

    public String getTimezone_id() {

        return timezone_id;
    }

    public void setTimezone_id(String timezone_id) {

        this.timezone_id = timezone_id;
    }

    public String getLocaltime() {

        return localtime;
    }

    public void setLocaltime(String localtime) {

        this.localtime = localtime;
    }

    public long getLocaltime_epoch() {

        return localtime_epoch;
    }

    public void setLocaltime_epoch(long localtime_epoch) {

        this.localtime_epoch = localtime_epoch;
    }

    public String getUtc_offset() {

        return utc_offset;
    }

    public void setUtc_offset(String utc_offset) {

        this.utc_offset = utc_offset;
    }

    @Override
    public String toString() {
        return "LocationDTO [name=" + name + ", country=" + country + ", region=" + region + ", lat=" + lat
                + ", lon=" + lon + ", timezone_id=" + timezone_id + ", localtime=" + localtime
                + ", localtime_epoch=" + localtime_epoch + ", utc_offset=" + utc_offset + "]";
    }

}
