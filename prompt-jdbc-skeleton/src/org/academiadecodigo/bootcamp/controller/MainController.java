package org.academiadecodigo.bootcamp.controller;


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
