package com.dev.exceptions;

public class CacheNotFoundException extends RuntimeException {
    public CacheNotFoundException(final String id) {
        super(String.format("cache not found for id: %s", id));
    }
}
