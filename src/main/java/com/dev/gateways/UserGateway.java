package com.dev.gateways;

import com.dev.domains.User;

public interface UserGateway {

    User create(final User user);

    User findByID(final String id);

}
