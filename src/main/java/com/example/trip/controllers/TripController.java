package com.example.trip.controllers;

import com.example.trip.models.Trip;
import com.example.trip.repositories.TripRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trips")
public class TripController {

    private final TripRepository tripRepository;

    public TripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @GetMapping("/")
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Trip getTripById(@PathVariable("id") String id) throws Exception {
        return tripRepository.findById(id).orElseThrow(Exception::new);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Trip addTrip(@RequestBody Trip trip) {
        return tripRepository.save(trip);
    }
}
