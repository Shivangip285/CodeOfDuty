package com.example.ObjectCounter.repository;

import com.example.ObjectCounter.model.ObjectCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjectRepository extends JpaRepository<ObjectCount, Integer>{
  List<ObjectCount> findByObjectName(String objectName);
}