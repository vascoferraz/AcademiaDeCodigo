package org.academiadecodigo.bootcamp.controller;


public class LoginController extends AbstractController {

    private Controller nextController;
    private boolean authFailed = false;

    public void onLogin(String username, String password) {

        if (!userService.authenticate(username, password)) {
            authFailed = true;
            init();
            return;
        }

        nextController.init();

    }

    public void setNextController(Controller nextController) {
        this.nextController = nextController;
    }

    public boolean isAuthFailed() {
        return authFailed;
    }
}
