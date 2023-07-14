package com.example.CodeOfDuty.model;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
public class Medicine {
    private String name;
    private int quantity;

}
