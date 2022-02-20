package com.codescad.education.institute.controller;

import com.codescad.education.institute.model.GenericResponse;
import com.codescad.education.institute.model.request.RegisterStudent;
import com.codescad.education.institute.service.StudentService;
import com.codescad.education.institute.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rahul Jaiman
 * @date 2022-02-19 12:31 AM
 */
@RestController
@RequestMapping(value = Constants.INSTITUTE_BASE_URL)
public class InstituteController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = Constants.REGISTER_STUDENT)
    public ResponseEntity<GenericResponse> registerStudent(@RequestBody RegisterStudent registerStudent) {
        GenericResponse response = studentService.register(registerStudent);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = Constants.UPDATE_STUDENT)
    public ResponseEntity<GenericResponse> updateStudent(@RequestBody RegisterStudent registerStudent) {
        GenericResponse response = studentService.update(registerStudent);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }




}
