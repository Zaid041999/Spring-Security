package com.codingshuttle.SecurityApp.SecurityApplication.advice;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiError {

    private LocalDateTime timeStamp;
    private String error;
    private HttpStatus statusCode;

    public ApiError() {
        this.timeStamp = LocalDateTime.now();
    }

    public ApiError(HttpStatus statusCode, String error) {
        this();
        this.statusCode = statusCode;
        this.error = error;
    }
}
