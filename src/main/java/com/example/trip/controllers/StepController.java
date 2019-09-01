package com.example.trip.controllers;

import com.example.trip.models.Step;
import com.example.trip.models.Trip;
import com.example.trip.repositories.StepRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/steps")
public class StepController {
    private final StepRepository stepRepository;


    public StepController(StepRepository stepRepository) {
        this.stepRepository = stepRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Step> getAllSteps() {
        return stepRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Step getStepById(@PathVariable("id") String id) throws Exception {
        return stepRepository.findById(id).orElseThrow(Exception::new);
    }
}
