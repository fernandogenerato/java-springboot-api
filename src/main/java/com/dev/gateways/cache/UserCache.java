package com.dev.gateways.cache;

import com.dev.domains.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Users")
@NoArgsConstructor
@AllArgsConstructor
public class UserCache implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String document;
    private String name;
    private String email;

    public UserCache(final User user) {
        name = user.getName();
        document = user.getDocument();
        email = user.getEmail();
    }

    public User toDomain() {
        return User.builder().name(name).document(document).email(email).build();
    }
}
