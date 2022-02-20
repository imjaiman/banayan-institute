package com.codescad.education.institute.model.entity;

/**
 * banayan-institute
 *
 * @author Mohit Sharma
 * 21-02-2022 00:05
 */

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "STUDENT")


public class UsersEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")
    @SequenceGenerator(allocationSize = 1, name = "student_id_seq", sequenceName = "student_id_seq")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MID_NAME")
    private String midName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "ALTERNATE_MOBILE")
    private String alternateMobile ;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "DESIGNATION")
    private String designation;

}
