package com.workoutapp.workoutapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "workout_details")
@Data
public class WorkoutDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "workout_details_id")
    private Long workoutDetailsId;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "workout_id")
    @JoinColumn(name = "workout_id", nullable = false)
    private WorkoutHeader workoutIdLong;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "lift_name")
    @JoinColumn(name = "lift_name", nullable = false)
    private WeightliftingMovements liftName;

    @Column(name = "set_number")
    private Integer setNumber;
    
    @Column(name = "repetitions")
    private Integer repetitions;

    @Column(name = "weight")
    private Integer weight;    

}
