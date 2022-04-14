package com.workoutapp.workoutapp.dao;

import com.workoutapp.workoutapp.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends JpaRepository<Users, Long> {



    
}
