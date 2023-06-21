package com.group09.Presentationservice.controller;

import com.group09.Presentationservice.Repository.PresentionRepository;
import com.group09.Presentationservice.model.PresentationModel;
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
