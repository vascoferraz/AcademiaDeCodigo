package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.service.UserService;
import org.academiadecodigo.bootcamp.view.View;

public abstract class AbstractController implements Controller {

    protected UserService userService;
    protected View view;

    @Override
    public void init() {
        view.show();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setView(View view) {
        this.view = view;
    }
}
