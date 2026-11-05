package org.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserServlet {

    // @RequestMapping("/login")
    @RequestMapping("login")
    public String login() {
        System.out.println("login ok....");
        return "login_ok";
    }
}
