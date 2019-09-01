package com.example.trip.repositories;

import com.example.trip.models.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripRepository extends MongoRepository<Trip, String> {
}
