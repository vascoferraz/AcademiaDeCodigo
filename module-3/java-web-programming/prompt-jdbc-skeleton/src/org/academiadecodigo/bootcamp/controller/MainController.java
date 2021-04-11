package org.academiadecodigo.bootcamp.controller;


import org.academiadecodigo.bootcamp.service.JdbcUserService;

public class MainController extends AbstractController {

    private Controller userListController;
    private Controller userDetailsController;

    public void onMenuSelection(int answerIndex) {

        switch (answerIndex) {
            case 1:
                userListController.init();
                init();
                break;
            case 2:
                userDetailsController.init();
                init();
                break;
            case 3:
                if (userService instanceof JdbcUserService) {
                    ((JdbcUserService) userService).closeConnection();
                    System.out.println("Connection closed");
                }
                break;
        }
    }


    public void setUserListController(Controller userListController) {
        this.userListController = userListController;
    }

    public void setUserDetailsController(Controller userDetailsController) {
        this.userDetailsController = userDetailsController;
    }
}
