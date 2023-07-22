package com.example.CodeOfDuty.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
public class Vendors {
    List<VendorDetails> vendorList= Collections.emptyList();
}
