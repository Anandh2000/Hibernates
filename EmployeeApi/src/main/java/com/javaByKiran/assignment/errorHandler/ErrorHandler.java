package com.javaByKiran.assignment.errorHandler;

import java.time.LocalTime;
import java.util.NoSuchElementException;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class ErrorHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(NoSuchElementException.class)
    private ResponseEntity<ErrorResponse> handleEntityNotFound(NoSuchElementException ex){
        ErrorResponse error = new ErrorResponse("hello",LocalTime.now(),400);
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
}
