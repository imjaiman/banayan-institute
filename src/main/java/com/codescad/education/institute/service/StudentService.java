package com.codescad.education.institute.service;

import com.codescad.education.institute.model.GenericResponse;
import com.codescad.education.institute.model.request.RegisterStudent;

/**
 * @author Rahul Jaiman
 * @date 2022-02-20 12:34 AM
 */

public interface StudentService {
    GenericResponse register(RegisterStudent registerStudent);

    GenericResponse update(RegisterStudent registerStudent);
}
