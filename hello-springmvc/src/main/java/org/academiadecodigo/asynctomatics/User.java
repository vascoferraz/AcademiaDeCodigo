package org.academiadecodigo.asynctomatics;

import org.springframework.web.bind.annotation.ModelAttribute;

public class User {

    private String name;
    private String email;

    @ModelAttribute ("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ModelAttribute ("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
