package org.academiadecodigo.asynctomatics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class HelloController {

    private User user;

    public HelloController(User user) {
        this.user = user;
    }

    private int counter = 0;


    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView saySecretHello() {

        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("user", user);
        return mv;
    }


    @ModelAttribute("date")
    public LocalDateTime getRequestTime() {
        return LocalDateTime.now();
    }

    @ModelAttribute("visits")
    public int getRequestCount() {
        return ++counter;
    }
}
