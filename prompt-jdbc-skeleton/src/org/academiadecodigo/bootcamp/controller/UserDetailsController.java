package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.User;

public class UserDetailsController extends AbstractController {


    public User getUser(String username) {
        return userService.findByName(username);
    }
}
