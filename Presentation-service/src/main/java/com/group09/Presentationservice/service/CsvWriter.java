package com.group09.Presentationservice.service;

import com.group09.Presentationservice.model.PresentationModel;
import com.opencsv.CSVWriter;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class CsvWriter {

    private static final String CSV_FILE_PATH = "C:\\Users\\615699\\Desktop\\WeatherData.CSV";

    public void writeToCsv(PresentationModel data){
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE_PATH, true))){
            String[] values = {
              data.getRegion(),
                    String.valueOf(data.getTemperature()),
                    String.valueOf(data.getHumidity()),
                    String.valueOf(data.getWind_speed()),
                    data.getLocaltime()
            };
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
