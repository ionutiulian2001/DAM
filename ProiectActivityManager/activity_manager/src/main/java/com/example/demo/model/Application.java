package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="applications")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Application {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="application_id")
    private Long applicationId;

    @Column(name="application_name")
    private String applicationName;

    private String applicationCode;

    private String productOwner;

    private String projectManager;

    private Integer developersNumber;

    private Date startDate;
    private Date endDate;



}
