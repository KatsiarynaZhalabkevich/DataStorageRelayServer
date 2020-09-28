package com.github.zhalabkevich.registration.service;

import com.github.zhalabkevich.registration.model.User;

public interface UserService {
    User findUserByEmail(String email);
    User addUser (User user);
    User authorizeUser(User user);

    //TODO deleteUser(), changeStatus(), changeRole(), editProfile() etc.

}
