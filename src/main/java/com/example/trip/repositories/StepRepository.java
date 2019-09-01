package com.example.trip.repositories;

import com.example.trip.models.Step;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StepRepository extends MongoRepository<Step, String> {
}
