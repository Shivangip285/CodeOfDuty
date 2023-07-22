package com.example.CodeOfDuty.model;

import com.example.CodeOfDuty.AvalabilityStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@AllArgsConstructor
public class MedicinesAvalibilityStatus {
    AvalabilityStatus status;

    MedicineDetails medicineDetails;
    Integer vendortId;
    Double availableMedicineCost;

    public void setStatus(AvalabilityStatus status) {
        if(availableMedicineCost ==0){
            this.status=AvalabilityStatus.Unavailable;
        }
    }

//    public MedicineDetails getMedicineDetails() {
//        if(status.equals(AvalabilityStatus.Unavailable)) {
//           throw new IndexOutOfBoundsException("Expected medicine is out of stock");
//        }
//        return medicineDetails;
//    }
}
