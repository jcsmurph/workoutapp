package com.workoutapp.workoutapp.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "workouts")
@Data
public class Workouts {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "workout_id")
    private Long workoutId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lift_name")
    @JoinColumn(name = "lift_name", nullable = false)
    private List<WeightliftingMovements[]> lifts;

    // Need to figure out how to implement sets and reps in DB and here. Need to have one lift have many sets and each set has one rep
    @Column(name = "sets_per_lift")
    private List<Integer> setsPerLift;
    
    @Column(name = "reps_per_set")
    private List<Integer> repsPerSet;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "day_of_week")
    private String dayOfWeek;

    @Column(name = "date_of_workout")
    private Date dateOfWorkout;

    Workouts() {}

    @SuppressWarnings("unchecked")
    Workouts(Long userId, List lifts, List setsPerLift, List repsPerSet, Integer weight, String dayOfWeek, Date dateOfWorkout) {

        this.userId = userId;
        this.lifts = lifts;
        this.setsPerLift = setsPerLift;
        this.repsPerSet = repsPerSet;
        this.weight = weight;
        this.dayOfWeek = dayOfWeek;
        this.dateOfWorkout = dateOfWorkout;

    }

}
