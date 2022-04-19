package com.workoutapp.workoutapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "workoutDetails", path = "workout-details")
public interface WorkoutDetails extends JpaRepository<WorkoutDetails, Long>{
    
}
