package com.group09.Presentationservice.service;

import com.group09.Presentationservice.Repository.PresentionRepository;
import com.group09.Presentationservice.model.PresentationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

        @Autowired
        private PresentionRepository presentionRepository;

        @KafkaListener(topics = "RTDIS_IOWA")
        public void consumeData(@Payload WeatherDTO data) {
            // Process the received data and save it to MongoDB
            PresentationModel entity = new PresentationModel();
            // Set relevant fields in the entity based on the received data
            entity.setRegion(data.getLocation().getRegion());
            entity.setTemperature(data.getCurrent().getTemperature());
            entity.setHumudity(data.getCurrent().getHumidity());
            entity.setWindSpeed(data.getCurrent().getWind_speed());
            entity.setLocalTime(data.getLocation().getLocaltime());
            presentionRepository.save(entity);
        }

}
