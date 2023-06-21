package com.group09.Presentationservice.Repository;

import com.group09.Presentationservice.model.PresentationModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PresentionRepository extends MongoRepository<PresentationModel, String> {
}
