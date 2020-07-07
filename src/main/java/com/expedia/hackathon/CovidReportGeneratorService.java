package com.expedia.hackathon;

import com.expedia.hackathon.model.CovidReport;
import com.expedia.hackathon.model.Location;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.singletonList;

@Service
public class CovidReportGeneratorService
{
    public List<CovidReport> getCovidReport(final CovidReport covidReport)
    {
        return generateCovidReport(covidReport);
    }

    private List<CovidReport> generateCovidReport(final CovidReport covidReport)
    {
        return getMockedResponse(covidReport);
    }


    //hardcoded api response
    private List<CovidReport> getMockedResponse(final CovidReport covidData)
    {
        final Location pickupLocation = new Location(1211, "SEA", "Seattle", -122.33,  47.60);
        final Location dropOffLocation = new Location(1222, "MIA", "Miami", -80.19,  25.76);
        final Map<String, Object> report = new HashMap<>();
        report.put("covidZoneCategoryOfPickup", "Orange");
        report.put("covidZoneCategoryOfDropOff", "Green");
        final CovidReport covidReport = new CovidReport();
        covidReport.setPickupLocation(pickupLocation);
        covidReport.setDropOffLocation(dropOffLocation);
        covidReport.setPickupDate(LocalDate.now());
        covidReport.setDropOffDate(LocalDate.now().plusDays(3));
        covidReport.setReport(report);

        return singletonList(covidReport);
    }
}
