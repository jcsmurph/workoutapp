package com.workoutapp.workoutapp.entity;

import java.util.Date;

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
@Table(name = "workout_header")
@Data
public class WorkoutHeader {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "workout_id")
    private Long workoutId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users userId;

    @Column(name = "day_of_week")
    private String dayOfWeek;

    @Column(name = "date_of_workout")
    private Date dateOfWorkout;

}
