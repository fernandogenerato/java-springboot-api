package com.dev.controllers.handlers;

public enum ErrorCode {
    RESOURCE_NOT_FOUND("resource not found"),
    VALIDATION_FAILED("request validation failed");

    private final String defaultMessage;

    ErrorCode(final String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public String getMessage() {
        return defaultMessage;
    }
}