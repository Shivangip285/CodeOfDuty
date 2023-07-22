package com.example.CodeOfDuty.service;

import com.example.CodeOfDuty.AvalabilityStatus;
import com.example.CodeOfDuty.model.MedicinesAvalibilityStatus;
import com.example.CodeOfDuty.model.Patient;
import com.example.CodeOfDuty.model.VendorDetails;
import com.example.CodeOfDuty.model.Vendors;
import com.example.CodeOfDuty.repository.PatientRepository;
import com.example.CodeOfDuty.repository.VendorDetailsRepository;
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
    private final VendorDetailsRepository vendorDetailsRepository;
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
    public void availableMedicineInfo(Integer patientId){
        Map<String, Integer> prescription=patientRepository.findByPatientId(patientId).getPrescription();
        Vendors vendors=new Vendors(vendorDetailsRepository.findAll());
        vendors.getVendorList().stream().forEach(x->{
            prescription.forEach((y,p)->{
                x.getMedicineDetails().stream().forEach(a->{
                    if(a.getMedicineName().equals(y)){
                        double costOfAvailableMedicine = a.getCountAvailable() > p ? p * a.getCost() : a.getCountAvailable() * a.getCost();
                        MedicinesAvalibilityStatus medicinesAvalibilityStatus = MedicinesAvalibilityStatus.builder().medicineDetails(a).availableMedicineCost(costOfAvailableMedicine).vendortId(x.getVendortId()).build();
                        if (a.getCountAvailable() > p) {
                            medicinesAvalibilityStatus.setStatus(AvalabilityStatus.Available);
                        } else {
                            medicinesAvalibilityStatus.setStatus(AvalabilityStatus.PartiallyAvailable);
                        }
                        System.out.println(costOfAvailableMedicine);
                        System.out.println(medicinesAvalibilityStatus+""+medicinesAvalibilityStatus.getStatus());
                    }
                });
            });
        });
    }
}
