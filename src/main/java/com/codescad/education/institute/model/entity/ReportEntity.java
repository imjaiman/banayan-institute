package com.codescad.education.institute.model.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Rahul Jaiman
 * @date 2022-02-21 12:16 AM
 */


@Data
@Entity
@Table(name = "REPORT")
public class ReportEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_id_seq")
    @SequenceGenerator(allocationSize = 1, name = "report_id_seq", sequenceName = "report_id_seq")
    private Long id;

    @Column(name = "BATCH_ID")
    private String batchId;

    @Column(name = "EXAM_TYPE")
    private String examType;

    @Column(name = "GRADE")
    private String grade;

    @Column(name = "MAX_MARKS")
    private String maxMarks;

    @Column(name = "MIN_MARKS")
    private String minMarks;

    @Column(name = "MARKS")
    private String marks;

    @Column(name = "SUBJECT")
    private String subject;
}