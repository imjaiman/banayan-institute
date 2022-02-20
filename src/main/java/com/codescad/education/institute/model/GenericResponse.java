package com.codescad.education.institute.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * @author Rahul Jaiman
 * @date 2022-02-20 12:36 AM
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class GenericResponse<T> {

    @ApiModelProperty(notes = "Success status code")
    private String status;
    @ApiModelProperty(notes = "Success status message")
    private String message;
    @ApiModelProperty(notes = "error")
    private String error;
    @ApiModelProperty(notes = "response")
    private T response;
    @ApiModelProperty(notes = "timestamp")
    private Instant timestamp = Instant.now();
}