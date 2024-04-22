package com.paulofranklins.moviestore.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @Autowired
    private HttpServletRequest request;

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        String path = getRequestPath();
        StandardError err = new StandardError(Instant.now(), status.value(), "Not found", e.getMessage(), path);
        return ResponseEntity.status(status).body(err);
    }

    private String getRequestPath() {
        if (request != null) {
            return request.getRequestURI();
        }
        return null;
    }
}
