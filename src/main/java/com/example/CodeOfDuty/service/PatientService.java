package com.example.CodeOfDuty.service;

import com.example.CodeOfDuty.model.Patient;
import com.example.CodeOfDuty.repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class PatientService {
    @Autowired
    private final PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        Patient save = patientRepository.save(patient);

        sendNotification(save.getPatientId());
        return patientRepository.findByPatientId(save.getPatientId());
    }

    public void sendNotification(Integer id){
        log.info("Sending notification"+patientRepository.findByPatientId(id).getPrescription());
    }
}
