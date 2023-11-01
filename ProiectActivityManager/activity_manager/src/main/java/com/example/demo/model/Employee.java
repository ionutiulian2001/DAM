package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String status;
    private String directSuperior;
    private String contractType;
    private String role;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

}
