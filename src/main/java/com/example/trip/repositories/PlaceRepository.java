package com.example.trip.repositories;

import com.example.trip.models.Place;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaceRepository extends MongoRepository<Place, String> {
}
