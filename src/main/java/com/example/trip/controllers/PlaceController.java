package com.example.trip.controllers;

import com.example.trip.models.Place;
import com.example.trip.repositories.PlaceRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/places")
public class PlaceController {
    private final PlaceRepository placeRepository;


    public PlaceController(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Place getPlaceById(@PathVariable("id") String id) throws Exception {
        return placeRepository.findById(id).orElseThrow(Exception::new);
    }
}
