package com.expedia.hackathon.model;

public class Location
{
    private int locationId;
    private String locationCode; //3 letter location code that is used generally within expedia
    private String locationName;
    private double longitude;
    private double latitude;

    public Location()
    {

    }

    public Location(int locationId, String locationCode, String locationName, double longitude, double latitude)
    {
        this.locationId = locationId;
        this.locationCode = locationCode;
        this.locationName = locationName;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getLocationId()
    {
        return locationId;
    }

    public void setLocationId(int locationId)
    {
        this.locationId = locationId;
    }

    public String getLocationCode()
    {
        return locationCode;
    }

    public void setLocationCode(String locationCode)
    {
        this.locationCode = locationCode;
    }

    public String getLocationName()
    {
        return locationName;
    }

    public void setLocationName(String locationName)
    {
        this.locationName = locationName;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }

    @Override
    public String toString()
    {
        return "Location{" +
                "locationId=" + locationId +
                ", locationCode='" + locationCode + '\'' +
                ", locationName='" + locationName + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
