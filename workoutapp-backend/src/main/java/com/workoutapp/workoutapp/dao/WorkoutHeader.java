package com.workoutapp.workoutapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "workoutHeader", path = "workout-header")
public interface WorkoutHeader extends JpaRepository<WorkoutHeader, Long>{
    
}

