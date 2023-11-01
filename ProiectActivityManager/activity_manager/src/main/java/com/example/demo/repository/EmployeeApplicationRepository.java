package com.example.demo.repository;

import com.example.demo.model.EmployeeApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeApplicationRepository extends JpaRepository<EmployeeApplication, Long> {
}
