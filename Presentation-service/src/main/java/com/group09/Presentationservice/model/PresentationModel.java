package com.group09.Presentationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PresentationModel {
    @Id
    private String region;
    private int temperature;
    private int humudity;
    private int windSpeed;
    private String localTime;

}
