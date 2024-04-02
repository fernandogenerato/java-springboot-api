package com.dev.controllers.handlers;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ErrorResponse {
    private String code;
    private String message;
    private List<String> errors;
}