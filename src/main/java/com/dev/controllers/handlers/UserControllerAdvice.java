package com.dev.controllers.handlers;

import com.dev.exceptions.CacheNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

import static com.dev.controllers.handlers.ErrorCode.RESOURCE_NOT_FOUND;
import static com.dev.controllers.handlers.ErrorCode.VALIDATION_FAILED;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@RestControllerAdvice
public class UserControllerAdvice {
    @ExceptionHandler(CacheNotFoundException.class)
    public ResponseEntity<ErrorResponse> cacheNotFound(final CacheNotFoundException e) {
        var response = ErrorResponse.builder()
                .code(RESOURCE_NOT_FOUND.name())
                .errors(List.of(e.getMessage()))
                .message(RESOURCE_NOT_FOUND.getMessage()).build();
        return new ResponseEntity<>(response, NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> requestValidation(final MethodArgumentNotValidException e) {
        var errors = e.getAllErrors()
                .stream()
                .map(ex -> String.format("%s: %s", ((FieldError) ex).getField(), ex.getDefaultMessage()))
                .collect(Collectors.toList());

        var response = ErrorResponse.builder()
                .code(VALIDATION_FAILED.name())
                .message(VALIDATION_FAILED.getMessage())
                .errors(errors)
                .build();
        return new ResponseEntity<>(response, BAD_REQUEST);
    }
}
