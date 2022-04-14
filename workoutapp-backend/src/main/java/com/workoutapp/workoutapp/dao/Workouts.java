package com.workoutapp.workoutapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "workouts", path = "workouts")
public interface Workouts extends JpaRepository<Workouts, Long>{
    
}
