package com.dev.gateways.cache;

import com.dev.exceptions.CacheNotFoundException;
import org.springframework.data.repository.CrudRepository;

public interface UserCacheRepository extends CrudRepository<UserCache, String> {

    default UserCache findByIDOrThrow(final String id) {
        return findById(id).orElseThrow(() -> new CacheNotFoundException(id));
    }
}
