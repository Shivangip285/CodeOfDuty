package com.example.CodeOfDuty.model;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
public class Patient {
    @Id
    private int patientId;
    private String patientName;
    private int phoneNumber;
    private String city;
    private Medicine[] prescription;

}