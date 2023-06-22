package com.group9.presentation.controller;

import com.group9.presentation.model.PresentationModel;
import com.group9.presentation.repository.PresentionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class PresentationController {
    @Autowired
    public PresentionRepository presentionRepository;


    @GetMapping
    public List<PresentationModel> getData(){
        return presentionRepository.findAll();
    }
}
