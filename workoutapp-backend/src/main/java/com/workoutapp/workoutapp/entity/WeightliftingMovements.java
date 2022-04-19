package com.workoutapp.workoutapp.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="weightlifting_movements")
@Data
public class WeightliftingMovements {

    @Id
    @Column(name = "lift_name")
    private String liftName;

    @Column(name = "body_part")
    private String bodyPart;
}
