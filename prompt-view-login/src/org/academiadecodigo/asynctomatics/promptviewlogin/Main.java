package org.academiadecodigo.asynctomatics.promptviewlogin;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);
        HashMap<String, String> users = new HashMap();
        String[] options1 = {"Register", "Login", "List Users"};


        while (true) {

            MenuInputScanner scanner = new MenuInputScanner(options1);
            scanner.setMessage("Select your option");

            int answerIndex = prompt.getUserInput(scanner);
            System.out.println("User wants to " + options1[answerIndex - 1]);

            MainMenu mainMenu = new MainMenu(prompt, users, answerIndex);
        }

    }

}

