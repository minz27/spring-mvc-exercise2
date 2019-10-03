package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = "/")
    public String user(Model model){
        User user = new User();
        user.setUserName("mreenav");
        model.addAttribute("name", user.getUserName());
        return "index";
    }
}
