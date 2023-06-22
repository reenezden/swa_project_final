package com.group9.presentation.service;

import com.group9.presentation.model.PresentationModel;
import com.opencsv.CSVWriter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class CsvWriter {

	@Value("${csv.file_path}")
	private String CSV_FILE_PATH;

	public void writeToCsv(PresentationModel data) {
		try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE_PATH, true))) {
			String[] values = { data.getRegion(), String.valueOf(data.getTemperature()),
					String.valueOf(data.getHumidity()), String.valueOf(data.getWind_speed()), data.getLocaltime() };
			writer.writeNext(values);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
