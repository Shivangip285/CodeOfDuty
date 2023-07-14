package com.example.CodeOfDuty.repository;

import com.example.CodeOfDuty.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Patient findByPatientId(Integer objectName);
}
