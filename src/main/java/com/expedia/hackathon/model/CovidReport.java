package com.expedia.hackathon.model;

import java.time.LocalDate;
import java.util.Map;

public class CovidReport
{
    private LocalDate pickupDate;
    private LocalDate dropOffDate;
    private Location pickupLocation;
    private Location dropOffLocation;

    /* This map will return data like whether the given location is in red/orange/green zone. This can be further
    extended for returning predictions for future dates as well */
    private Map<String, Object> report;

    public CovidReport()
    {

    }

    public CovidReport(LocalDate pickupDate, LocalDate dropOffDate, Location pickupLocation, Location dropOffLocation, Map<String, Object> report)
    {
        this.pickupDate = pickupDate;
        this.dropOffDate = dropOffDate;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.report = report;
    }

    public LocalDate getPickupDate()
    {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate)
    {
        this.pickupDate = pickupDate;
    }

    public LocalDate getDropOffDate()
    {
        return dropOffDate;
    }

    public void setDropOffDate(LocalDate dropOffDate)
    {
        this.dropOffDate = dropOffDate;
    }

    public Location getPickupLocation()
    {
        return pickupLocation;
    }

    public void setPickupLocation(Location pickupLocation)
    {
        this.pickupLocation = pickupLocation;
    }

    public Location getDropOffLocation()
    {
        return dropOffLocation;
    }

    public void setDropOffLocation(Location dropOffLocation)
    {
        this.dropOffLocation = dropOffLocation;
    }

    public Map<String, Object> getReport()
    {
        return report;
    }

    public void setReport(Map<String, Object> report)
    {
        this.report = report;
    }

    @Override
    public String toString()
    {
        return "CovidReport{" +
                "pickupDate=" + pickupDate +
                ", dropOffDate=" + dropOffDate +
                ", pickupLocation=" + pickupLocation +
                ", dropOffLocation=" + dropOffLocation +
                ", report=" + report +
                '}';
    }
}
