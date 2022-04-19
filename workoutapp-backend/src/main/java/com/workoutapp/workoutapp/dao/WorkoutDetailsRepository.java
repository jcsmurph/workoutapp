package com.workoutapp.workoutapp.dao;
import com.workoutapp.workoutapp.entity.WorkoutDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "workoutDetails", path = "workout-details")
public interface WorkoutDetailsRepository extends JpaRepository<WorkoutDetails, Long>{
    
}