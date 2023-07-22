package com.example.CodeOfDuty.service;

import com.example.CodeOfDuty.AvalabilityStatus;
import com.example.CodeOfDuty.model.MedicinesAvalibilityStatus;
import com.example.CodeOfDuty.model.VendorDetails;
import com.example.CodeOfDuty.model.Vendors;
import com.example.CodeOfDuty.repository.PatientRepository;
import com.example.CodeOfDuty.repository.VendorDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class VendorService {
    @Autowired
    private final VendorDetailsRepository vendorDetailsRepository;
    @Autowired
    private final PatientRepository patientRepository;

    public VendorDetails addVendor(VendorDetails vendorDetails){
        vendorDetailsRepository.save(vendorDetails);
        //availableMedicineInfo(1);
        return vendorDetailsRepository.findByVendortId(vendorDetails.getVendortId());
    }

    public Vendors getAllVendor(){
        Vendors vendors=new Vendors(vendorDetailsRepository.findAll());
        return vendors;
    }

//    public void availableMedicineInfo(Integer patientId){
//        Map<String, Integer> prescription=patientRepository.findByPatientId(patientId).getPrescription();
//        Vendors vendors=new Vendors(vendorDetailsRepository.findAll());
//        vendors.getVendorList().stream().forEach(x->{
//            prescription.forEach((y,p)->{
//                x.getMedicineDetails().stream().forEach(a->{
//                    if(a.getMedicineName().equals(y)){
//                        double costOfAvailableMedicine = a.getCountAvailable() > p ? p * a.getCost() : a.getCountAvailable() * a.getCost();
//                        MedicinesAvalibilityStatus medicinesAvalibilityStatus = MedicinesAvalibilityStatus.builder().medicineDetails(a).availableMedicineCost(costOfAvailableMedicine).vendortId(x.getVendortId()).build();
//                        if (a.getCountAvailable() > p) {
//                            medicinesAvalibilityStatus.setStatus(AvalabilityStatus.Available);
//                        } else {
//                            medicinesAvalibilityStatus.setStatus(AvalabilityStatus.PartiallyAvailable);
//                        }
//                        System.out.println("abc"+costOfAvailableMedicine);
//                        System.out.println(medicinesAvalibilityStatus+""+medicinesAvalibilityStatus.getStatus());
//                    }
//                });
//            });
//        });
//    }
}
