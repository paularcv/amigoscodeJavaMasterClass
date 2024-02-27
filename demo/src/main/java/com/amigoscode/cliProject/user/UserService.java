package com.amigoscode.cliProject.user;

import java.util.List;
import java.util.UUID;

public class UserService {

    private final UserDAO userDao = new UserFileDataAccessService();

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public User getUserById(UUID id) {
        for (User user : getUsers()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

}
