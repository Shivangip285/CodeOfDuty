package com.example.CodeOfDuty.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
@Data
@Entity
@Table
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    private String patientName;
    private int phoneNumber;
    private String city;

    @ElementCollection
    private Map<String, Integer> prescription = new HashMap<>();

    public Patient() {

    }
}