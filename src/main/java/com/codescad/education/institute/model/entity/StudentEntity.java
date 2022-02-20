package com.codescad.education.institute.model.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Rahul Jaiman
 * @date 2022-02-20 12:44 AM
 */

@Data
@Entity
@Table(name = "STUDENT")
public class StudentEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")
    @SequenceGenerator(allocationSize = 1, name = "student_id_seq", sequenceName = "student_id_seq")
    private Long id;

    @Column(name = "ROLL_NO")
    private String rollNo;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MID_NAME")
    private String midName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BATCH")
    private String batch;

    @Column(name = "FATHERS_NAME")
    private String fathersName;

    @Column(name = "FATHERS_OCCUPATION")
    private String fathersOccupation;

    @Column(name = "MOTHERS_NAME")
    private String mothersName;

    @Column(name = "MOTHERS_OCCUPATION")
    private String mothersOccupation;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "ALTERNATE_NUMBER")
    private String alternateNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ADDRESS")
    private String address;

}