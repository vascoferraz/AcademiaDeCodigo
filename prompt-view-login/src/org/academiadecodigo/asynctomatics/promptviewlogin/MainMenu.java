package org.academiadecodigo.asynctomatics.promptviewlogin;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.HashMap;
import java.util.Set;

public class MainMenu {

    private Prompt prompt;
    private HashMap<String, String> users;
    private Integer menu;
    private Set<String> keys;


    public MainMenu(Prompt prompt, HashMap users, Integer menu) {

        this.prompt = prompt;
        this.users = users;
        this.menu = menu;


        keys = users.keySet();

        if (menu.equals(1)) {
            register();
        }

        if (menu.equals(2)) {
            login();
        }

        if (menu.equals(3)) {
            listUsers();
        }

    }

    public void register() {

        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("Username:");

        PasswordInputScanner question2 = new PasswordInputScanner();
        question2.setMessage("Password: ");

        String name = prompt.getUserInput(question1);
        String password = prompt.getUserInput(question2);

        users.put(name, password);
    }

    public void login() {

        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("Username:");

        PasswordInputScanner question2 = new PasswordInputScanner();
        question2.setMessage("Password: ");

        String name = prompt.getUserInput(question1);
        String password = prompt.getUserInput(question2);


        keys = users.keySet();
        for (String key : keys) {


            if (!key.equals(name)) {
                System.out.println("User does not exist");
                return;

            }
            if (key.equals(name) && !users.get(key).equals(password)) {
                System.out.println("Wrong password");
                return;
            } else {
                System.out.println("Logged in");
                return;
            }
        }
    }

    public void listUsers() {

        if (users.size() == 0) {
            System.out.println("The user list is empty");
            return;
        }

        for (String key : keys) {
            System.out.println("Username: " + key + " | Password: " + users.get(key));
        }
    }
}










