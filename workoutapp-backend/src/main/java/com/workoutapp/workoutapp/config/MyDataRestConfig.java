package com.workoutapp.workoutapp.config;

import com.workoutapp.workoutapp.entity.Users;
import com.workoutapp.workoutapp.entity.WeightliftingMovements;
import com.workoutapp.workoutapp.entity.Workouts;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        // disable HTTP methods for movements
        config.getExposureConfiguration()
        .forDomainType(WeightliftingMovements.class)
        .withItemExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.DELETE))
        .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.DELETE));

        config.getExposureConfiguration()
        .forDomainType(Users.class)
        .withItemExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.DELETE))
        .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.DELETE));
        
        config.getExposureConfiguration()
        .forDomainType(WorkoutHeader.class)
        .withItemExposure((metadata, httpMethods) -> httpMethods.disable())
        .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable());
    }
    
}
