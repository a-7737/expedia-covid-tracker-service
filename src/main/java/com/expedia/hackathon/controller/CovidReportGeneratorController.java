package com.expedia.hackathon.controller;

import com.expedia.hackathon.CovidReportGeneratorService;
import com.expedia.hackathon.model.CovidReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/covid")
public class CovidReportGeneratorController
{
    @Autowired
    private CovidReportGeneratorService covidReportGeneratorService;

    @GetMapping(path = "/report")
    public List<CovidReport> getCovidReport(@RequestBody CovidReport covidReport)
    {
        return this.covidReportGeneratorService.getCovidReport(covidReport);
    }

}
