package org.academiadecodigo.bootcamp.view;

import org.academiadecodigo.bootcamp.controller.LoginController;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class LoginView extends AbstractView {

    private LoginController controller;

    public void show() {

        if (controller.isAuthFailed()) {
            System.out.println("\n" + Messages.LOGIN_ERROR + "\n");
        }

        showWelcomeMessage();
        showLoginPrompt();
    }

    private void showWelcomeMessage() {
        System.out.println("\n" + Messages.STARTUP_MSG);
    }

    private void showLoginPrompt() {
        System.out.println("\n" + Messages.LOGIN_MSG);
        scanCredentials();
    }


    private void scanCredentials() {
        StringInputScanner scanner = new StringInputScanner();
        PasswordInputScanner passwordScanner = new PasswordInputScanner();

        scanner.setMessage("Username: ");
        String username = prompt.getUserInput(scanner);

        passwordScanner.setMessage("Password: ");
        String password = prompt.getUserInput(passwordScanner);

        controller.onLogin(username, password);
    }

    public void setController(LoginController controller) {
        this.controller = controller;
    }
}
