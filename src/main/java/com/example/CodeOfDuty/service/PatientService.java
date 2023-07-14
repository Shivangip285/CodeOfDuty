package com.example.CodeOfDuty.service;

import com.example.CodeOfDuty.model.Patient;
import com.example.CodeOfDuty.repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        log.info(patient.toString());
        log.info(patientRepository.findAll().toString());
        return patientRepository.save(patient);
    }


}
