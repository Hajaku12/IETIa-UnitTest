package org.adaschool.Weather.service;

import org.adaschool.Weather.data.WeatherReport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class WeatherReportServiceTest {

    @InjectMocks
    private WeatherReportService weatherReportService;

    @Test
    public void testGetWeatherReport() {
        WeatherReport weatherReport = weatherReportService.getWeatherReport(37.8267, -122.4233);

        assertNotNull(weatherReport);
        assertNotNull(weatherReport.getTemperature());
        assertNotNull(weatherReport.getHumidity());
    }
}