package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User user){
        ModelAndView modelAndView = new ModelAndView("/loginSuccess");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/")
    public String home(){
        return "index";
    }
}
