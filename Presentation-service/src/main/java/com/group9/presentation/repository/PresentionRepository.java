package com.group9.presentation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.group9.presentation.model.PresentationModel;

public interface PresentionRepository extends MongoRepository<PresentationModel, String> {
}
