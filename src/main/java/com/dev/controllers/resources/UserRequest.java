package com.dev.controllers.resources;

import com.dev.domains.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String document;
    @Email
    @NotBlank
    private String email;

    private boolean risk;

    public User toDomain() {
        return User.builder()
                .email(email)
                .name(name)
                .document(document)
                .build();
    }
}

