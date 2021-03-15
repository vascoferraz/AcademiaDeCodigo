package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.User;

import java.util.List;

public class UserListController extends AbstractController {

    public List<User> getUserList() {
        return userService.findAll();
    }

}
