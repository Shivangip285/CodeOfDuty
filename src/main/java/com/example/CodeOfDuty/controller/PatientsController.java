package com.example.CodeOfDuty.controller;

import com.example.CodeOfDuty.model.Patient;
import com.example.CodeOfDuty.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PatientsController {

    @Autowired
    private final PatientService patientService;

    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }
}