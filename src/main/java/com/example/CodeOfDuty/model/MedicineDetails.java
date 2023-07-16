package com.example.CodeOfDuty.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MedicineDetails {
    String medicineName;
    Integer countAvailable;
    Double cost;
}
