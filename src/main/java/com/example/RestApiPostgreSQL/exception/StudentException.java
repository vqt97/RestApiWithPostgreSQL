package com.example.RestApiPostgreSQL.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class StudentException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public StudentException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }
}
