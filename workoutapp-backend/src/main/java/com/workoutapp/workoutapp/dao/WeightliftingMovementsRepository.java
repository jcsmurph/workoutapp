package com.workoutapp.workoutapp.dao;

import com.workoutapp.workoutapp.entity.WeightliftingMovements;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "weightliftingMovements", path = "weightlifting-movements")
public interface WeightliftingMovementsRepository extends JpaRepository<WeightliftingMovements, String>{
    
}
