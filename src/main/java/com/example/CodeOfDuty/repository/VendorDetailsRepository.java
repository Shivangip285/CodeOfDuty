package com.example.CodeOfDuty.repository;

import com.example.CodeOfDuty.model.Patient;
import com.example.CodeOfDuty.model.VendorDetails;
import com.example.CodeOfDuty.model.Vendors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorDetailsRepository extends JpaRepository<VendorDetails, Integer> {
    VendorDetails findByVendortId(Integer objectName);

}
