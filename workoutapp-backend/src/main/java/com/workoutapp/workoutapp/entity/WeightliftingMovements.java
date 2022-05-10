package com.workoutapp.workoutapp.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="weightlifting_movements")
public class WeightliftingMovements {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lift_id")
    private Integer liftId;

    @Column(name = "lift_name")
    private String liftName;

    @Column(name = "body_part")
    private String bodyPart;

    public String getLiftName(Integer liftId) {
        this.liftId = liftId;
        
        return liftName;
    }

    public void addLift(String liftName, String bodyPart) {
        this.liftName = liftName;
        this.bodyPart = bodyPart;
    }




}
