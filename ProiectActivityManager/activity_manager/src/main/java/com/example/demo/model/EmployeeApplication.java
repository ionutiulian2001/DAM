package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="employee_applications")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeAppId;

    @OneToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @OneToOne
    @JoinColumn(name="application_id")
    private Application application;
    private String allocation;
    private Date startDate;
    private Date endDate;
}
