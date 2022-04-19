package com.workoutapp.workoutapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "workoutHeader", path = "workout-header")
public interface WorkoutHeader extends JpaRepository<WorkoutHeader, Long>{
    
}

