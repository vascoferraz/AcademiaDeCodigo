package org.academiadecodigo.asynctomatics;

import org.springframework.stereotype.Controller;
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
    public ModelAndView index() {

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("user", user);
        return mv;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/news")
    public ModelAndView news() {

        ModelAndView mv = new ModelAndView("/news");
        mv.addObject("user", user);
        return mv;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/contact")
    public ModelAndView contact() {

        ModelAndView mv = new ModelAndView("contact");
        mv.addObject("user", user);
        return mv;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/about")
    public ModelAndView about() {

        ModelAndView mv = new ModelAndView("about");
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
