package com.dev.gateways;

import com.dev.domains.User;
import com.dev.gateways.cache.UserCache;
import com.dev.gateways.cache.UserCacheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

    private final UserCacheRepository repository;

    @Override
    public User create(final User user) {
        return repository.save(new UserCache(user)).toDomain();
    }

    @Override
    public User findByID(final String id) {
        return repository.findByIDOrThrow(id).toDomain();
    }

}
