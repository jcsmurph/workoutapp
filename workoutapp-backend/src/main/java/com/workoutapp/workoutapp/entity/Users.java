package com.workoutapp.workoutapp.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    public void addUser(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }


}