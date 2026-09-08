package org.example.task_manager.User;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class UserRepo {

    // logger
    Logger logger = Logger.getLogger(UserRepo.class.getName());

    // opprett en ny bruker
    public static User register(User user) {
        return UserRepo.register(user);
    }
}