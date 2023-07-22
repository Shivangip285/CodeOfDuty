package com.example.CodeOfDuty.controller;

import com.example.CodeOfDuty.model.VendorDetails;
import com.example.CodeOfDuty.model.Vendors;
import com.example.CodeOfDuty.service.VendorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class VendorController {
    @Autowired
    private final VendorService vendorService;

    @PostMapping("/vendor")
    public VendorDetails addVendor(@RequestBody VendorDetails vendorDetails) {
        return vendorService.addVendor(vendorDetails);
    }

    @GetMapping("/allVendors")
    public Vendors getVendorList(){
        return vendorService.getAllVendor();
    }

}
