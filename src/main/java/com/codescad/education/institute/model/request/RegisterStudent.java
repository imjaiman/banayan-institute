package com.codescad.education.institute.model.request;

import lombok.Data;

/**
 * @author Rahul Jaiman
 * @date 2022-02-20 12:28 AM
 */
@Data
public class RegisterStudent {
    private String name;
    private String batch;
    private String fathersName;
    private String mothersName;
    private String phoneNumber;
    private String alternatePhoneNumber;
    private String emailId;
    private String address;
}
