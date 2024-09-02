package com.codingshuttle.SecurityApp.SecurityApplication.advice;


import com.codingshuttle.SecurityApp.SecurityApplication.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleResourceNotFoundException(ResourceNotFoundException e){
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, e.getMessage());
        return new ResponseEntity<>(apiError,HttpStatus.NOT_FOUND);
    }
}
