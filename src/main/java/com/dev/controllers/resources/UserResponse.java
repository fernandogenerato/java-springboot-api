package com.dev.controllers.resources;


import com.dev.domains.User;
import lombok.Getter;

@Getter
public class UserResponse {
    private String name;
    private String document;
    private String email;

    public UserResponse(User user) {
        name = user.getName();
        document = user.getDocument();
        email = user.getEmail();
    }
}
