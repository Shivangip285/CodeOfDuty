package com.example.CodeOfDuty.model;

import com.example.CodeOfDuty.AvalabilityStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MedicinesAvalibilityStatus {
    AvalabilityStatus status;

    MedicineDetails medicineDetails;

    public MedicineDetails getMedicineDetails() {
        if(status.equals(AvalabilityStatus.Unavailable)) {
           throw new IndexOutOfBoundsException("Expected medicine is out of stock");
        }
        return medicineDetails;
    }
}
