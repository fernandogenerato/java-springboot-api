package com.dev.usecases;

import com.dev.domains.User;
import com.dev.gateways.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUser {

    private final UserGateway u;

    public User execute(final User user) {
        return u.create(user);
    }
}
