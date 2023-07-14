package com.example.CodeOfDuty.repository;

import com.example.CodeOfDuty.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer>, JpaRepository<Patient, Integer> {
}