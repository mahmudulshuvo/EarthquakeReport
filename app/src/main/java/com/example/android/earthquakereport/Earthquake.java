package com.example.android.earthquakereport;



public class Earthquake {

    private String magnitude;
    private String locationOffset;
    private String primaryLocation;
    private String time;
    private String date;
    private String url;


    public Earthquake(String defaultMagnitude, String defaultLocationOffset, String defaultPrimaryLocation, String defaultTime, String defaultDate, String defaultUrl) {
        magnitude = defaultMagnitude;
        locationOffset = defaultLocationOffset;
        primaryLocation = defaultPrimaryLocation;
        time = defaultTime;
        date = defaultDate;
        url = defaultUrl;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocationOffset() {return locationOffset; }

    public String getPrimaryLocation() { return primaryLocation; }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() { return url; }

}