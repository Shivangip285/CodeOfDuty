package com.example.CodeOfDuty.model;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table
@AllArgsConstructor
public class Patient {
    @Id
    private int patientId;
    private String patientName;
    private int phoneNumber;
    private String city;

//    @Type(type = "list")
//    @Column(columnDefinition = "medicine")
//    @OneToMany

    @ElementCollection
    private Map<String, Integer> prescription = new HashMap<>();

    public Patient() {

    }
}