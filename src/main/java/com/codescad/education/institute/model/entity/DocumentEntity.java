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
 * @author Rahul Jaiman
 * @date 2022-02-21 12:14 AM
 */


@Data
@Entity
@Table(name = "DOCUMENT")
public class DocumentEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "document_id_seq")
    @SequenceGenerator(allocationSize = 1, name = "document_id_seq", sequenceName = "document_id_seq")
    private Long id;
}