package com.dev.controllers;

import com.dev.controllers.resources.UserRequest;
import com.dev.controllers.resources.UserResponse;
import com.dev.usecases.CreateUser;
import com.dev.usecases.GetUserByID;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequestMapping("/users")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final CreateUser createUser;
    private final GetUserByID getUserByID;

    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody @Valid final UserRequest request) {
        var u = createUser.execute(request.toDomain());
        return new ResponseEntity<>(new UserResponse(u), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserByID(@PathVariable final String id) {
        var u = getUserByID.execute(id);
        return new ResponseEntity<>(new UserResponse(u), HttpStatus.OK);
    }
}
