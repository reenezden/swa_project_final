package com.group09.Presentationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class PresentationModel {
    @Id
    private String region;
    private int temperature;
    private int humidity;
    private int wind_speed;
    private String localtime;

}
