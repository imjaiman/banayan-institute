package com.codescad.education.institute.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * banayan-institute
 *
 * @author Mohit Sharma
 * 21-02-2022 00:20
 */
@Data
@Entity
@Table(name = "Institute")
public class InstituteEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")
    @SequenceGenerator(allocationSize = 1, name = "student_id_seq", sequenceName = "student_id_seq")
    private Long id;


    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "REGISTRATION_NUMBER")
    private String registrationNumber;

    @Column(name = "BRANCH")
    private String branch;

    @Column(name = "CODE")
    private String code;
}
