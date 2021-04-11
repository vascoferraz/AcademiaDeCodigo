package org.academiadecodigo.bootcamp.view;

import org.academiadecodigo.bootcamp.controller.UserDetailsController;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class UserDetailsView extends AbstractView {

    private UserDetailsController controller;

    @Override
    public void show() {

        User user = selectUser();

        if (user == null) {
            System.out.println("\n" + Messages.USER_DETAILS_ERROR);
            return;
        }

        showDetails(user);
    }

    private User selectUser() {

        StringInputScanner scanner = new StringInputScanner();
        scanner.setError("\n" + Messages.USER_DETAILS_ERROR);
        scanner.setMessage("\n" + Messages.USER_DETAILS_SELECTION);

        return controller.getUser(prompt.getUserInput(scanner));
    }

    private void showDetails(User user) {

        System.out.println("\nUsername: " + user.getUsername() + "\n" +
                "Name: " + user.getFirstName() + " " + user.getLastName() + "\n" +
                "Phone: " + user.getPhone() + "\n" +
                "Email: " + user.getEmail());
    }

    public void setController(UserDetailsController controller) {
        this.controller = controller;
    }
}
