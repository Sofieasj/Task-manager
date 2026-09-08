package org.example.task_manager.user;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class UserRepository {

    // logger
    Logger logger = Logger.getLogger(UserRepository.class.getName());

    // opprett en ny bruker
    public static User register(User user) {
        return UserRepository.register(user);
    }
}