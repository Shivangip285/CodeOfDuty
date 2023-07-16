package com.example.CodeOfDuty.controller;

import com.example.CodeOfDuty.model.Patient;
import com.example.CodeOfDuty.model.VendorDetails;
import com.example.CodeOfDuty.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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