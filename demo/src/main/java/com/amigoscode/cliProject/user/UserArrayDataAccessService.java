package com.amigoscode.cliProject.user;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class UserArrayDataAccessService implements UserDAO {

    private static final List<User> users;

    static {
        users = Arrays.asList(
                new User(UUID.randomUUID(), "Jamila"),
                new User(UUID.randomUUID(), "Musa")
        );
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
