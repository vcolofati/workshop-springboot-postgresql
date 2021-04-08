package com.example.victor.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.victor.course.services.exceptions.DatabaseException;
import com.example.victor.course.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandartError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest req) {
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandartError err = new StandartError(Instant.now(), status.value(), error, e.getMessage(), req.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandartError> database(DatabaseException e, HttpServletRequest req) {
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandartError err = new StandartError(Instant.now(), status.value(), error, e.getMessage(), req.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
