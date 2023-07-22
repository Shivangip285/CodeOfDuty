package com.example.CodeOfDuty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
public class VendorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vendortId;

    @Type(type = "list")
    @Column(columnDefinition = "medicineDetails")
    @OneToMany(cascade = CascadeType.ALL)
    List<MedicineDetails> medicineDetails;

    public VendorDetails() {

    }
}
