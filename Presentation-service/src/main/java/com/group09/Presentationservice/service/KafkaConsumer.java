package com.group09.Presentationservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.group09.Presentationservice.Repository.PresentionRepository;
import com.group09.Presentationservice.model.CurrentDTO;
import com.group09.Presentationservice.model.LocationDTO;
import com.group09.Presentationservice.model.PresentationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
        @Autowired
        private CsvWriter csvWriter;

        @Autowired
        private PresentionRepository presentionRepository;
        PresentationModel entity = new PresentationModel();
        ObjectMapper objectMapper = new ObjectMapper();
        public void mergedData(){
            presentionRepository.save(entity);
            System.out.println("Saved Data"+entity);
        }

    private String determineTopic(String message) {

        if (message.contains("observation_time")) {
            return "jdrs_current";
        } else if (message.contains("region")) {
            return "jdrs_location";
        }

        throw new IllegalArgumentException("Unable to determine topic for message: " + message);
    }

    @KafkaListener(topics = {"jdrs_location", "jdrs_current"})
    public void consumeData(String message) {
        try {
            String topic = determineTopic(message);

            if (topic.equals("jdrs_current")) {
                WeatherDTO.CurrentDTO currentDTO = objectMapper.readValue(message, WeatherDTO.CurrentDTO.class);

                entity.setTemperature(currentDTO.getTemperature());
                entity.setHumidity(currentDTO.getHumidity());
                entity.setWind_speed(currentDTO.getWind_speed());
            } else if (topic.equals("jdrs_location")) {
                WeatherDTO.LocationDTO locationDTO = objectMapper.readValue(message, WeatherDTO.LocationDTO.class);

                entity.setRegion(locationDTO.getRegion());
                entity.setLocaltime(locationDTO.getLocaltime());
            }

            mergedData();
            csvWriter.writeToCsv(entity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
}


}
