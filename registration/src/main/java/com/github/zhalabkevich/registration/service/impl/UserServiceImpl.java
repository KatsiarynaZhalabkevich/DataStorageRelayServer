package com.github.zhalabkevich.registration.service.impl;

import com.github.zhalabkevich.registration.model.User;
import com.github.zhalabkevich.registration.repository.UserRepository;
import com.github.zhalabkevich.registration.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElseGet(() -> user.orElse(null));
    }

    @Override
    public User addUser(User user) {
        User userFromDB = findUserByEmail(user.getEmail());
        if (userFromDB == null) {
            User newUser = userRepository.save(user);
            return newUser;
        } else {
            return null;
        }
    }

    @Override //password  not encrypted!!!
    public User authorizeUser(User user) {
        User userFromDB = findUserByEmail(user.getEmail());
        if (userFromDB != null) {
            if (!userFromDB.getPassword().equals(user.getPassword())) {
                user = null;
            }

        } else {
            user = null;
        }
        return user;
    }

    //TODO validate email, validate User's fields
}
