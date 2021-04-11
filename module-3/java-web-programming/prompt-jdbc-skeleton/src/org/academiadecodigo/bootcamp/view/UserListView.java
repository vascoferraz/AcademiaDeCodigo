package org.academiadecodigo.bootcamp.view;

import org.academiadecodigo.bootcamp.controller.UserListController;
import org.academiadecodigo.bootcamp.model.User;

public class UserListView extends AbstractView {

    private UserListController controller;

    @Override
    public void show() {
        showUserList();
    }

    private void showUserList() {

        System.out.printf("\n%-12s %-30s", "Username", "Email");
        System.out.printf("\n%-50s", new String(new char[50]).replace("\0", "-"));

        for (User user : controller.getUserList()) {
            System.out.printf("\n%-12s %-30s", user.getUsername(), user.getEmail());
        }
    }


    public void setController(UserListController controller) {
        this.controller = controller;
    }
}
