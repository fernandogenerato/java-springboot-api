package com.dev.domains;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
    private String name;
    private String document;
    private String email;
}
