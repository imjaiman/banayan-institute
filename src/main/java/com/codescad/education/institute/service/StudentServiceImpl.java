package com.codescad.education.institute.service;

import com.codescad.education.institute.model.GenericResponse;
import com.codescad.education.institute.model.request.RegisterStudent;
import org.springframework.stereotype.Service;

/**
 * @author Rahul Jaiman
 * @date 2022-02-20 1:36 AM
 */
@Service
public class StudentServiceImpl  implements StudentService {
    /**
     * this method is used to register the student
     * @param registerStudent
     * @return
     */
    @Override
    public GenericResponse register(RegisterStudent registerStudent) {
        return null;
    }


    /**
     * this method is used to update the student that is already register
     * @param registerStudent
     * @return
     */
    @Override
    public GenericResponse update(RegisterStudent registerStudent) {
        return null;
    }
}
