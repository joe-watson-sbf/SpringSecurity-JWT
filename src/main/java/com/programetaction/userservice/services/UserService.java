package com.programetaction.userservice.services;

import com.programetaction.userservice.domain.Role;
import com.programetaction.userservice.domain.User;

import java.util.List;

/**
 * @author JOSEPH WATZSON alias Joe Watson SBF (https://www.instagram.com/joe_watson_sbf)
 * @version 1.0
 * @since 27/07/2021
 * */

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();

}
